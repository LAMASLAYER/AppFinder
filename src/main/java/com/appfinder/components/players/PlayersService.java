package com.appfinder.components.players;

import java.util.List;

public interface PlayersService {
    Players getPlayerById(Integer playerId);
    void savePlayer(Players playersDto);
    List<Players> getAllPlayers();
}
