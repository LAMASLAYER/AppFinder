package com.appfinder.components.players;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.apache.log4j.Logger;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/players")
public class PlayerController {

    private static final Logger LOGGER = Logger.getLogger(PlayerController.class);

    private final PlayerRepository playerRepository;
    private final PlayersService playersService;

    @Autowired
    public PlayerController(PlayerRepository playerRepository, PlayersService playersService) {
        this.playerRepository = playerRepository;
        this.playersService = playersService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<Players> getAllPlayers() {
        LOGGER.info("Retrieving players...");
        return playerRepository.findAll();
    }



    @GetMapping(path = "/playerId/{playerId}")
    public Players getUserById(@PathVariable int playerId) {
        LOGGER.info("Retrieving player with the id: " + playerId);
        return playersService.getPlayerById(playerId);
    }

    @PostMapping(path = "/post")
    public void savePlayer(Players player) {
        LOGGER.info("Saving Player " + player);
        playersService.savePlayer(player);
    }
}
