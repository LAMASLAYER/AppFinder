package com.appfinder.gear;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/gear")
public class GearController {

    private static final Logger LOGGER = Logger.getLogger(GearController.class);
    private final GearRepository gearRepository;
    private final GearService gearService;

    @Autowired
    public GearController(GearRepository gearRepository, GearService gearService) {
        this.gearRepository = gearRepository;
        this.gearService = gearService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<Gear> getAllGear() {
        LOGGER.info("Retrieving GearType...");
        return gearRepository.findAll();
    }



    @GetMapping(path = "/gearId/{gearId}")
    public Gear getGearById(@PathVariable int gearId) {
        LOGGER.info("Retrieving GearType with the id: " + gearId);
        return gearService.getGearById(gearId);
    }

    @PostMapping(path = "/post")
    public void saveGear(@RequestBody Gear gear) {
        LOGGER.info("Saving GearType " + gear);
        gearService.saveGear(gear);
    }

    @GetMapping(path = "/name/{name}")
    public Gear getGearByName(@PathVariable String name) {
        LOGGER.info("Retrieving GearType with the name: " + name);
        return gearService.getGearByName(name);
    }

    @GetMapping(path = "/abilityId/{abilityId}")
    public List<Gear> getGearyByName(@PathVariable int abilityId) {
        LOGGER.info("Retrieving GearType with the ability id: " + abilityId);
        return gearService.getGearByStat(abilityId);
    }

    @GetMapping(path = "/typeId/{typeId}")
    public List<Gear> getGearByType(@PathVariable int typeId) {
        LOGGER.info("Retrieving GearType with the ability id: " + typeId);
        return gearService.getGearByType(typeId);
    }
}
