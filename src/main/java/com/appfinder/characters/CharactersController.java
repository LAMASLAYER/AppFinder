package com.appfinder.characters;


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

    @GetMapping(path = "/all")
    @ResponseBody
    public List<Characters> getAllCharacters() {
        LOGGER.info("Retrieving Skills...");
        return charactersRepository.findAll();
    }



    @GetMapping(path = "/charid/{charId}")
    public Characters getCharacterById(@PathVariable int charId) {
        LOGGER.info("Retrieving Character with the id: " + charId);
        return charactersService.getCharacterById(charId);
    }

    @PostMapping(path = "/post")
    public void saveCharacter(@RequestBody Characters character) {
        LOGGER.info("Saving Character " + character);
        charactersService.saveCharacter(character);
    }

    @GetMapping(path = "/playerid/{playerId}")
    public List<Characters> getCharactersByPlayerId(@PathVariable int playerId) {
        LOGGER.info("Retrieving characters of player with the id: " + playerId);
        return charactersService.getCharactersByPlayerId(playerId);
    }
}
