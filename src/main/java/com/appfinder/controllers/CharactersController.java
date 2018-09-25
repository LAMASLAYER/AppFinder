package com.appfinder.controllers;


import com.appfinder.models.Characters;
import com.appfinder.repositories.CharactersRepository;
import com.appfinder.services.CharactersService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/characters")
public class CharactersController {

    private static final Logger LOGGER = Logger.getLogger(CharactersController.class);

    private final CharactersRepository charactersRepository;
    private final CharactersService charactersService;

    @Autowired
    public CharactersController(CharactersRepository charactersRepository, CharactersService charactersService) {
        this.charactersRepository = charactersRepository;
        this.charactersService = charactersService;
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<Characters> getAllCharacters() {
        LOGGER.info("Retrieving Characters...");
        return charactersRepository.findAll();
    }



    @RequestMapping("/{char_id}")
    public Characters getCharacterById(@PathVariable Integer char_id) {
        LOGGER.info("Retrieving player " + char_id);
        return charactersService.getCharacterById(char_id);
    }

    @RequestMapping("/post")
    public void saveUser(@RequestBody Characters character) {
            charactersService.saveCharacter(character);
    }
}
