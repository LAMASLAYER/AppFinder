package com.appfinder.components.charwealth;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/charWealth")
public class CharWealthController {

    private static final Logger LOGGER = Logger.getLogger(CharWealthController.class);
    private final CharWealthRepository charWealthRepository;
    private final CharWealthService charWealthService;

    @Autowired
    public CharWealthController(CharWealthRepository charWealthRepository, CharWealthService charWealthService) {
        this.charWealthRepository = charWealthRepository;
        this.charWealthService = charWealthService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<CharWealth> getAllCharWealth() {
        LOGGER.info("Retrieving CharWealths...");
        return charWealthRepository.findAll();
    }



    @GetMapping(path = "/charId/{charId}")
    public CharWealth getCharWealthById(@PathVariable int charId) {
        LOGGER.info("Retrieving CharWealth with the id: " + charId);
        return charWealthService.getByCharId(charId);
    }

    @PostMapping(path = "/post")
    public void saveCharWealth(@RequestBody CharWealth charWealth) {
        LOGGER.info("Saving CharWealth " + charWealth);
        charWealthService.saveCharWealth(charWealth);
    }



}
