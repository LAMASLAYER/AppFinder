package com.appfinder.abilities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/abilities")
public class AbilitiesController {

    private static final Logger LOGGER = Logger.getLogger(AbilitiesController.class);

    private final AbilitiesRepository abilitiesRepository;
    private final AbilitiesService abilitiesService;

    @Autowired
    public AbilitiesController(AbilitiesRepository abilitiesRepository, AbilitiesService abilitiesService) {
        this.abilitiesRepository = abilitiesRepository;
        this.abilitiesService = abilitiesService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<Abilities> getAllAbilities() {
        LOGGER.info("Retrieving abilities...");
        return abilitiesRepository.findAll();
    }



    @GetMapping(path = "/abilityid/{abilityId}")
    public Abilities getAbilityById(@PathVariable int abilityId) {
        LOGGER.info("Retrieving Ability with the id: " + abilityId);
        return abilitiesService.getAbilityById(abilityId);
    }

    @PostMapping(path = "/post")
    public void saveAbility(@RequestBody Abilities ability) {
        LOGGER.info("Saving Ability " + ability);
        abilitiesService.saveAbility(ability);
    }

    @GetMapping(path = "/name/{name}")
    public Abilities getAbilityByName(@PathVariable String name) {
        LOGGER.info("Retrieving Ability with the name: " + name);
        return abilitiesService.getAbilityByName(name);
    }
}
