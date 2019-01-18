package com.appfinder.security.login;


import com.appfinder.components.players.PlayerRepository;
import com.appfinder.components.players.Players;
import com.appfinder.components.players.PlayersService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {

  private final PlayerRepository playerRepository;
  private final PlayersService playersService;

  private static final Logger LOGGER = Logger.getLogger(LoginController.class);

  @Autowired
  public LoginController(PlayerRepository playerRepository, PlayersService playersService) {
    this.playerRepository = playerRepository;
    this.playersService = playersService;
  }

  @PostMapping(path = "/connect")
  public ResponseEntity.BodyBuilder login(Login login) {
    LOGGER.info("Resolving password of " + login.getLogin());
    Players player = this.playersService.getPlayerByName(login.getLogin());
    if (player == null) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND);
    }else if (player.getName().equals(login.getLogin()) && !player.getPassword().equals(login.getPassword())) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED);
    }else{
      return ResponseEntity.status(HttpStatus.ACCEPTED);
    }
  }


}
