package com.appfinder.components.classfeats;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/classFeat")
public class ClassFeatsController {

    private static final Logger LOGGER = Logger.getLogger(ClassFeatsController.class);
    private final ClassFeatsRepository classFeatsRepository;
    private final ClassFeatsService classFeatsService;

    @Autowired
    public ClassFeatsController(ClassFeatsRepository classFeatRepository, ClassFeatsService classFeatService) {
        this.classFeatsRepository = classFeatRepository;
        this.classFeatsService = classFeatService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<ClassFeats> getAllClassFeat() {
        LOGGER.info("Retrieving ClassFeatType...");
        return classFeatsRepository.findAll();
    }



    @GetMapping(path = "/classId/{classId}")
    public List<ClassFeats> getClassFeatById(@PathVariable int classId) {
        LOGGER.info("Retrieving ClassFeat with the id: " + classId);
        return classFeatsService.getByClassId(classId);
    }

    @PostMapping(path = "/post")
    public void saveClassFeat(@RequestBody ClassFeats classFeat) {
        LOGGER.info("Saving ClassFeatType " + classFeat);
        classFeatsService.saveClassFeat(classFeat);
    }



}
