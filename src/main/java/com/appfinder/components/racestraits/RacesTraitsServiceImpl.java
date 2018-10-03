package com.appfinder.components.racestraits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RacesTraitsServiceImpl implements RacesTraitsService {


    private final RacesTraitsRepository racesTraitsRepository;

    @Autowired
    public RacesTraitsServiceImpl(RacesTraitsRepository racesTraitsRepository) {
        this.racesTraitsRepository = racesTraitsRepository;
    }

    @Override
    public List<RacesTraits> getRaceById(Integer raceId) {
        return racesTraitsRepository.findByRaceId(raceId);
    }

    @Override
    public void saveRace(RacesTraits race) {
        racesTraitsRepository.save(race);
    }

    @Override
    public List<RacesTraits> getAllRacesTraits() {
        return racesTraitsRepository.findAll();
    }

    @Override
    public RacesTraits getRaceByName(String name) {
        return racesTraitsRepository.findByName(name);
    }

    @Override
    public RacesTraits getById(int id) { return racesTraitsRepository.findOne(id); }

}
