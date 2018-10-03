package com.appfinder.components.races;


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

    @GetMapping(path = "/all")
    @ResponseBody
    public List<Races> getAllRaces() {
        LOGGER.info("Retrieving races...");
        return racesRepository.findAll();
    }



    @GetMapping(path = "raceId/{raceId}")
    public Races getRaceById(@PathVariable int raceId) {
        LOGGER.info("Retrieving race with the id: " + raceId);
        return racesService.getRaceById(raceId);
    }


    @GetMapping(path = "name/{name}")
    public Races getRaceById(@PathVariable String name) {
        LOGGER.info("Retrieving race with the name: " + name);
        return racesService.getRaceByName(name);
    }

    @PostMapping(path = "/post")
    public void saveUser(@RequestBody Races race) {
        LOGGER.info("Saving Race " + race);
        racesService.saveRace(race);
    }
}
