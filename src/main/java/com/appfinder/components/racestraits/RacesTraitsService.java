package com.appfinder.components.racestraits;

import java.util.List;

public interface RacesTraitsService {
    List<RacesTraits> getRaceById(Integer raceId);
    void saveRace(RacesTraits playersDto);
    List<RacesTraits> getAllRacesTraits();
    RacesTraits getRaceByName(String name);
    RacesTraits getById(int id);
}
