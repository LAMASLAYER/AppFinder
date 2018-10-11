package com.appfinder.components.charclasses;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/charClass")
public class CharClassController {

    private static final Logger LOGGER = Logger.getLogger(CharClassController.class);
    private final CharClassRepository charClassRepository;
    private final CharClassService charClassService;

    @Autowired
    public CharClassController(CharClassRepository charClassRepository, CharClassService charClassService) {
        this.charClassRepository = charClassRepository;
        this.charClassService = charClassService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<CharClass> getAllCharClass() {
        LOGGER.info("Retrieving CharClassType...");
        return charClassRepository.findAll();
    }



    @GetMapping(path = "/charId/{charId}")
    public List<CharClass> getCharClassById(@PathVariable int charId) {
        LOGGER.info("Retrieving CharClass with the id: " + charId);
        return charClassService.getByCharId(charId);
    }

    @PostMapping(path = "/post")
    public void saveCharClass(@RequestBody CharClass charClass) {
        LOGGER.info("Saving CharClassType " + charClass);
        charClassService.saveCharClass(charClass);
    }


    @GetMapping(path = "/charId/{charId}/classId/{classId}")
    public CharClass getCharClassByIdAndClassId(@PathVariable int charId, @PathVariable int classId) {
        LOGGER.info("Retrieving CharClass with the id: " + charId + " and the class: " + classId);
        return charClassService.getByCharIdAndClassId(charId, classId);
    }

}
