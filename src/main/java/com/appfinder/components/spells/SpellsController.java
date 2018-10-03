package com.appfinder.components.spells;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/spells")
public class SpellsController {

    private static final Logger LOGGER = Logger.getLogger(SpellsController.class);

    private final SpellsRepository spellsRepository;
    private final SpellsService spellsService;

    @Autowired
    public SpellsController(SpellsRepository spellsRepository, SpellsService spellsService) {
        this.spellsRepository = spellsRepository;
        this.spellsService = spellsService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<Spells> getAllSpells() {
        LOGGER.info("Retrieving Spells...");
        return spellsRepository.findAll();
    }

    @GetMapping(path = "/spellId/{spellId}")
    public Spells getSpellsById(@PathVariable int spellId) {
        LOGGER.info("Retrieving spell with the id: " + spellId);
        return spellsService.getSpellById(spellId);
    }

    @PostMapping(path = "/post")
    public void saveAbility(@RequestBody Spells spell) {
            spellsService.saveSpell(spell);
    }

    @GetMapping(path = "/name/{name}")
    public Spells getSpellsByName(@PathVariable String name) {
        LOGGER.info("Retrieving spell with the name: " + name);
        return spellsService.getSpellByName(name);
    }

    @GetMapping(path = "/class/{casterClass}/level/{level}")
    public List<Spells> getSpellsByClassAndLevel(@PathVariable String casterClass, @PathVariable Integer level) {
        LOGGER.info("Retrieving spells linked with the class: " + casterClass + " and the level: " + level);
        return spellsService.getByClassAndLevel(casterClass, level);
    }

    @GetMapping(path = "/class/{casterClass}")
    public List<Spells> getSpellsByClass(@PathVariable String casterClass) {
        LOGGER.info("Retrieving spell with the class: " + casterClass);
        return spellsService.getByClass(casterClass);
    }

    @GetMapping(path = "/class/{casterClass}/levelLessThan/{level}")
    public List<Spells> getSpellsByClassAndLevelLessThanEqual(@PathVariable String casterClass, @PathVariable Integer level) {
        LOGGER.info("Retrieving spells with the class: " + casterClass + " and the level less or equal than: " + level);
        return spellsService.getByClassAndLevelLessThanEqual(casterClass, level);
    }

}
