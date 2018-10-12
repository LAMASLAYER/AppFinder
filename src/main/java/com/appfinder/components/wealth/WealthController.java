package com.appfinder.components.wealth;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/wealth")
public class WealthController {

    private static final Logger LOGGER = Logger.getLogger(WealthController.class);

    private final WealthRepository wealthRepository;
    private final WealthService wealthService;

    @Autowired
    public WealthController(WealthRepository wealthRepository, WealthService wealthService) {
        this.wealthRepository = wealthRepository;
        this.wealthService = wealthService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<Wealth> getAllWealth() {
        LOGGER.info("Retrieving wealth...");
        return wealthRepository.findAll();
    }

    @GetMapping(path = "/wealthId/{wealthId}")
    public Wealth getWealthById(@PathVariable int wealthId) {
        LOGGER.info("Retrieving wealth with the id: " + wealthId);
        return wealthService.getWealthById(wealthId);
    }


    @PostMapping(path = "/post")
    public void saveWealth(@RequestBody Wealth wealth) {
        LOGGER.info("Saving Wealth " + wealth);
        wealthService.saveWealth(wealth);
    }
}
