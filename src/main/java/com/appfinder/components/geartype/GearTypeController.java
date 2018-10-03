package com.appfinder.components.geartype;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/gearType")
public class GearTypeController {

    private static final Logger LOGGER = Logger.getLogger(GearTypeController.class);
    private final GearTypeRepository gearTypeRepository;
    private final GearTypeService gearTypeService;

    @Autowired
    public GearTypeController(GearTypeRepository gearTypeRepository, GearTypeService gearTypeService) {
        this.gearTypeRepository = gearTypeRepository;
        this.gearTypeService = gearTypeService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<GearType> getAllGear() {
        LOGGER.info("Retrieving all types of gear...");
        return gearTypeRepository.findAll();
    }



    @GetMapping(path = "/gearTypeId/{gearTypeId}")
    public GearType getGearTypeById(@PathVariable int gearTypeId) {
        LOGGER.info("Retrieving Gear Type with the id: " + gearTypeId);
        return gearTypeService.getByGearTypeId(gearTypeId);
    }

    @PostMapping(path = "/post")
    public void saveGear(@RequestBody GearType gearType) {
        LOGGER.info("Saving the gear type: " + gearType);
        gearTypeService.saveGear(gearType);
    }

    @GetMapping(path = "/name/{name}")
    public GearType getGearByName(@PathVariable String name) {
        LOGGER.info("Retrieving GearType with the name: " + name);
        return gearTypeService.getGearByName(name);
    }

}
