package com.appfinder.components.racestraits;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/racesTraits")
public class RacesTraitsController {

    private static final Logger LOGGER = Logger.getLogger(RacesTraitsController.class);

    private final RacesTraitsRepository racesTraitsRepository;
    private final RacesTraitsService racesTraitsService;

    @Autowired
    public RacesTraitsController(RacesTraitsRepository racesTraitsRepository, RacesTraitsService racesTraitsService) {
        this.racesTraitsRepository = racesTraitsRepository;
        this.racesTraitsService = racesTraitsService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<RacesTraits> getAllRacesTraits() {
        LOGGER.info("Retrieving racesTraits...");
        return racesTraitsRepository.findAll();
    }



    @GetMapping(path = "raceId/{raceId}")
    public List<RacesTraits> getByRaceId(@PathVariable int raceId) {
        LOGGER.info("Retrieving traits with the race id: " + raceId);
        return racesTraitsService.getRaceById(raceId);
    }

    @GetMapping(path = "raceTraitId/{raceTraitId}")
    public RacesTraits getById(@PathVariable int raceTraitId) {
        LOGGER.info("Retrieving traits with the race id: " + raceTraitId);
        return racesTraitsService.getById(raceTraitId);
    }


    @GetMapping(path = "name/{name}")
    public RacesTraits getRaceById(@PathVariable String name) {
        LOGGER.info("Retrieving race trait with the name: " + name);
        return racesTraitsService.getRaceByName(name);
    }

    @PostMapping(path = "/post")
    public void saveRaceTrait(@RequestBody RacesTraits raceTrait) {
        LOGGER.info("Saving Race trait" + raceTrait);
        racesTraitsService.saveRace(raceTrait);
    }
}
