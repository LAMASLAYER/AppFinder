package com.appfinder.races;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RacesServiceImpl implements RacesService {


    private final RacesRepository racesRepository;

    @Autowired
    public RacesServiceImpl(RacesRepository racesRepository) {
        this.racesRepository = racesRepository;
    }

    @Override
    public Races getRaceById(Integer raceId) {
        return racesRepository.findOne(raceId);
    }

    @Override
    public void saveRace(Races race) {
        racesRepository.save(race);
    }

    @Override
    public List<Races> getAllRaces() {
        return racesRepository.findAll();
    }

    @Override
    public Races getRaceByName(String name) {
        return racesRepository.findByName(name);
    }

}
