package com.appfinder.services;

import com.appfinder.models.Races;

import java.util.List;

public interface RacesService {
    Races getRaceById(Integer player_id);
    void saveRace(Races playersDto);
    List<Races> getAllRaces();
}
