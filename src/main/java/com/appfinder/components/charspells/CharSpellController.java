package com.appfinder.components.charspells;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/charSpell")
public class CharSpellController {

    private static final Logger LOGGER = Logger.getLogger(CharSpellController.class);
    private final CharSpellRepository charSpellRepository;
    private final CharSpellService charSpellService;

    @Autowired
    public CharSpellController(CharSpellRepository charSpellRepository, CharSpellService charSpellService) {
        this.charSpellRepository = charSpellRepository;
        this.charSpellService = charSpellService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<CharSpell> getAllCharSpell() {
        LOGGER.info("Retrieving CharSpellType...");
        return charSpellRepository.findAll();
    }



    @GetMapping(path = "/charId/{charId}")
    public List<CharSpell> getCharSpellById(@PathVariable int charId) {
        LOGGER.info("Retrieving CharSpell with the id: " + charId);
        return charSpellService.getByCharId(charId);
    }

    @PostMapping(path = "/post")
    public void saveCharSpell(@RequestBody CharSpell charSpell) {
        LOGGER.info("Saving CharSpellType " + charSpell);
        charSpellService.saveCharSpell(charSpell);
    }



}
