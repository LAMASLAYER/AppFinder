package com.appfinder.classFeats;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/classFeats")
public class ClassFeatsController {

    private static final Logger LOGGER = Logger.getLogger(ClassFeatsController.class);

    private final ClassFeatsRepository classFeatsRepository;
    private final ClassFeatsService classFeatsService;

    @Autowired
    public ClassFeatsController(ClassFeatsRepository classFeatsRepository, ClassFeatsService classFeatsService) {
        this.classFeatsRepository = classFeatsRepository;
        this.classFeatsService = classFeatsService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<ClassFeats> getAllClassFeats() {
        LOGGER.info("Retrieving All class feats...");
        return classFeatsRepository.findAll();
    }

    @GetMapping(path = "/classFeatId/{classFeatId}")
    public ClassFeats getClassFeatsById(@PathVariable int classFeatId) {
        LOGGER.info("Retrieving classFeat with the id: " + classFeatId);
        return classFeatsService.getClassFeatById(classFeatId);
    }

    @PostMapping(path = "/post")
    public void saveAbility(@RequestBody ClassFeats classFeat) {
            classFeatsService.saveClassFeat(classFeat);
    }


    @GetMapping(path = "/classId/{classId}")
    public List<ClassFeats> getClassFeatsByClassId(@PathVariable int classId) {
        LOGGER.info("Retrieving classFeat with the class id: " + classId);
        return classFeatsService.getByClassId(classId);
    }


    @GetMapping(path = "/name/{name}")
    public List<ClassFeats> getClassFeatsByName(@PathVariable String name) {
        LOGGER.info("Retrieving classFeat with the name: " + name);
        return classFeatsService.getByName(name);
    }

    @GetMapping(path = "/type/{type}")
    public List<ClassFeats> getClassFeatsByType(@PathVariable int type) {
        LOGGER.info("Retrieving classFeat with the type: " + type);
        return classFeatsService.getByType(type);
    }
}
