package com.appfinder.components.feats;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/feats")
public class FeatsController {

    private static final Logger LOGGER = Logger.getLogger(FeatsController.class);

    private final FeatsRepository featsRepository;
    private final FeatsService featsService;

    @Autowired
    public FeatsController(FeatsRepository featsRepository, FeatsService featsService) {
        this.featsRepository = featsRepository;
        this.featsService = featsService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<Feats> getAllFeats() {
        LOGGER.info("Retrieving Feats...");
        return featsRepository.findAll();
    }

    @GetMapping(path = "/featId/{featId}")
    public Feats getFeatsById(@PathVariable int featId) {
        LOGGER.info("Retrieving feat with the id: " + featId);
        return featsService.getFeatById(featId);
    }

    @PostMapping(path = "/post")
    public void saveFeat(@RequestBody Feats feat) {
            featsService.saveFeat(feat);
    }

    @GetMapping(path = "/name/{name}")
    public Feats getFeatsByName(@PathVariable String name) {
        LOGGER.info("Retrieving feat with the name: " + name);
        return featsService.getFeatByName(name);
    }

    @GetMapping(path = "/charFeat/{ids}")
    public List<Feats> getByIdIn(@PathVariable("ids") Integer[] ids) {
        LOGGER.info("Retrieving Gears with ids of the list " + ids) ;
        return featsService.getByFeatsIdsIn(ids);
    }

}
