package com.appfinder.services;

import com.appfinder.models.Players;

import java.util.List;

public interface PlayersService {
    Players getPlayerById(Integer player_id);
    void savePlayer(Players playersDto);
    List<Players> getAllPlayers();
}
