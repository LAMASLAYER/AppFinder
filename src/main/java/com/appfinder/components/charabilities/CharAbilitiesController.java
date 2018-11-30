package com.appfinder.components.charabilities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/charAbilities")
public class CharAbilitiesController {

    private static final Logger LOGGER = Logger.getLogger(CharAbilitiesController.class);
    private final CharAbilitiesRepository charAbilitiesRepository;
    private final CharAbilitiesService charAbilitiesService;

    @Autowired
    public CharAbilitiesController(CharAbilitiesRepository charAbilitiesRepository, CharAbilitiesService charAbilitiesService) {
        this.charAbilitiesRepository = charAbilitiesRepository;
        this.charAbilitiesService = charAbilitiesService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<CharAbilities> getAllCharAbilities() {
        LOGGER.info("Retrieving CharAbilities...");
        return charAbilitiesRepository.findAll();
    }



    @GetMapping(path = "/charId/{charId}")
    public List<CharAbilities> getByCharId(@PathVariable int charId) {
        LOGGER.info("Retrieving CharAbilities with the id: " + charId);
        return charAbilitiesService.getByCharId(charId);
    }

    @PostMapping(path = "/post")
    public void saveCharAbilities(@RequestBody CharAbilities charAbilities) {
        if(null !=  charAbilitiesService.getByCharAbilityId(charAbilities.getCharAbilityId())) {
            LOGGER.info("Updating CharAbilities " + charAbilities);
        } else {
            LOGGER.info("Saving CharAbilities " + charAbilities);
        }
        charAbilitiesService.saveCharAbilities(charAbilities);
    }

    @GetMapping(path = "/abilityId/{abilityId}")
    public CharAbilities getByAbilityId(@PathVariable int abilityId) {
        LOGGER.info("Retrieving CharAbilities with the id: " + abilityId);
        return charAbilitiesService.getByAbilityId(abilityId);
    }

}
