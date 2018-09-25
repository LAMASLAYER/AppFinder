package com.appfinder.controllers;


import com.appfinder.models.Races;
import com.appfinder.repositories.RacesRepository;
import com.appfinder.services.RacesService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/races")
public class RacesController {

    private static final Logger LOGGER = Logger.getLogger(RacesController.class);

    private final RacesRepository racesRepository;
    private final RacesService racesService;

    @Autowired
    public RacesController(RacesRepository racesRepository, RacesService racesService) {
        this.racesRepository = racesRepository;
        this.racesService = racesService;
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<Races> getAllRaces() {
        LOGGER.info("Retrieving races...");
        return racesRepository.findAll();
    }



    @RequestMapping("/{race_id}")
    public Races getRaceById(@PathVariable Integer race_id) {
        LOGGER.info("Retrieving race " + race_id);
        return racesService.getRaceById(race_id);
    }

    @RequestMapping("/post")
    public void saveUser(@RequestBody Races race) {
            racesService.saveRace(race);
    }
}
