package com.appfinder.services;

import com.appfinder.models.Players;
import com.appfinder.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayersServiceImpl implements PlayersService {


    private final PlayerRepository userRepository;

    @Autowired
    public PlayersServiceImpl(PlayerRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Players getPlayerById(Integer user_id) {
        return userRepository.getOne(user_id);
    }
    @Override
    public void savePlayer(Players user) {
        userRepository.save(user);
    }
    @Override
    public List<Players> getAllPlayers() {
        return userRepository.findAll();
    }
}
