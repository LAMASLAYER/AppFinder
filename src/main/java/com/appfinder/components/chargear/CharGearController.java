package com.appfinder.components.chargear;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/charGear")
public class CharGearController {

    private static final Logger LOGGER = Logger.getLogger(CharGearController.class);
    private final CharGearRepository charGearRepository;
    private final CharGearService charGearService;

    @Autowired
    public CharGearController(CharGearRepository charGearRepository, CharGearService charGearService) {
        this.charGearRepository = charGearRepository;
        this.charGearService = charGearService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<CharGear> getAllCharGear() {
        LOGGER.info("Retrieving CharGearType...");
        return charGearRepository.findAll();
    }



    @GetMapping(path = "/charId/{charId}")
    public List<CharGear> getCharGearById(@PathVariable int charId) {
        LOGGER.info("Retrieving CharGear with the id: " + charId);
        return charGearService.getByCharId(charId);
    }

    @PostMapping(path = "/post")
    public void saveCharGear(@RequestBody CharGear charGear) {
        LOGGER.info("Saving CharGearType " + charGear);
        charGearService.saveCharGear(charGear);
    }



}
