package com.appfinder.services;

import com.appfinder.models.Races;
import com.appfinder.repositories.RacesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
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
    @Query("SELECT * FROM races r WHERE r.id=?#{id}")
    public Races getRaceById(Integer race_id) {
        return racesRepository.findOne(race_id);
    }

    @Override
    public void saveRace(Races race) {
        racesRepository.save(race);
    }

    @Override
    public List<Races> getAllRaces() {
        return racesRepository.findAll();
    }

}
