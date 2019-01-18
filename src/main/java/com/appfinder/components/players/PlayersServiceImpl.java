package com.appfinder.components.players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayersServiceImpl implements PlayersService {


    private final PlayerRepository playerRepository;

    @Autowired
    public PlayersServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public Players getPlayerById(Integer playerId) {
        return playerRepository.findOne(playerId);
    }

    @Override
    public void savePlayer(Players player) {
        playerRepository.save(player);
    }

    @Override
    public List<Players> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public Players getPlayerByName(String name) { return playerRepository.getPlayersByName(name); }

}
