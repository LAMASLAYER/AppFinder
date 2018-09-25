package com.appfinder.services;

import com.appfinder.models.Players;
import com.appfinder.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayersServiceImpl implements PlayersService {


    private final PlayerRepository playerRepository;

    @Autowired
    public PlayersServiceImpl(PlayerRepository userRepository) {
        this.playerRepository = userRepository;
    }

    @Override
    @Query("SELECT * FROM players p WHERE p.id=?#{id}")
    public Players getPlayerById(Integer player_id) {
        return playerRepository.findOne(player_id);
    }

    @Override
    public void savePlayer(Players player) {
        playerRepository.save(player);
    }

    @Override
    public List<Players> getAllPlayers() {
        return playerRepository.findAll();
    }

}
