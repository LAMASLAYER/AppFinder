package com.appfinder.controllers;



import com.appfinder.repositories.PlayerRepository;
import com.appfinder.models.Players;
import com.appfinder.services.PlayersService;
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

    @RequestMapping("/all")
    @ResponseBody
    public List<Players> getAllPlayers() {
        LOGGER.info("Retrieving players...");
        return playerRepository.findAll();
    }



    @RequestMapping("/{player_id}")
    public Players getUserById(@PathVariable Integer player_id) {
        LOGGER.info("Retrieving player " + player_id);
        return playersService.getPlayerById(player_id);
    }

    @RequestMapping("/post")
    public void saveUser(@RequestBody Players player) {
            playersService.savePlayer(player);
    }
}
