package com.appfinder.races;

import java.util.List;

public interface RacesService {
    Races getRaceById(Integer playerId);
    void saveRace(Races playersDto);
    List<Races> getAllRaces();
    Races getRaceByName(String name);
}
