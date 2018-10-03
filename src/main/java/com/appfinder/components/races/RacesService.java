package com.appfinder.components.races;

import java.util.List;

public interface RacesService {
    Races getRaceById(Integer raceId);
    void saveRace(Races race);
    List<Races> getAllRaces();
    Races getRaceByName(String name);
}
