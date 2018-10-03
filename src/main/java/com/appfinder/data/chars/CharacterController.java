package com.appfinder.data.chars;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/charBuilder")
public class CharacterController {

    private static final Logger LOGGER = Logger.getLogger(CharacterController.class);

    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }



    @GetMapping(path = "/charId/{charId}")
    public Character getBuildChar(@PathVariable int charId) {
        LOGGER.info("Retrieving Character with the id: " + charId);
        return characterService.buildChar(charId);
    }

}
