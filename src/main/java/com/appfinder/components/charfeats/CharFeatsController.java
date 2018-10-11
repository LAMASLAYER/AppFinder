package com.appfinder.components.charfeats;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/charFeat")
public class CharFeatsController {

    private static final Logger LOGGER = Logger.getLogger(CharFeatsController.class);
    private final CharFeatsRepository charFeatsRepository;
    private final CharFeatsService charFeatsService;

    @Autowired
    public CharFeatsController(CharFeatsRepository charFeatRepository, CharFeatsService charFeatService) {
        this.charFeatsRepository = charFeatRepository;
        this.charFeatsService = charFeatService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<CharFeats> getAllCharFeat() {
        LOGGER.info("Retrieving CharFeatType...");
        return charFeatsRepository.findAll();
    }



    @GetMapping(path = "/charId/{charId}")
    public List<CharFeats> getCharFeatById(@PathVariable int charId) {
        LOGGER.info("Retrieving CharFeat with the id: " + charId);
        return charFeatsService.getByCharId(charId);
    }

    @PostMapping(path = "/post")
    public void saveCharFeat(@RequestBody CharFeats charFeat) {
        LOGGER.info("Saving CharFeatType " + charFeat);
        charFeatsService.saveCharFeat(charFeat);
    }



}
