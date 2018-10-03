package com.appfinder.components.classes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/classes")
public class ClassesController {

    private static final Logger LOGGER = Logger.getLogger(ClassesController.class);

    private final ClassesRepository classesRepository;
    private final ClassesService classesService;

    @Autowired
    public ClassesController(ClassesRepository classesRepository, ClassesService classesService) {
        this.classesRepository = classesRepository;
        this.classesService = classesService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<Classes> getAllClasses() {
        LOGGER.info("Retrieving Classes...");
        return classesRepository.findAll();
    }

    @GetMapping(path = "/classId/{classId}")
    public Classes getClassById(@PathVariable int classId) {
        LOGGER.info("Retrieving class with the id: " + classId);
        return classesService.getClassById(classId);
    }

    @PostMapping(path = "/post")
    public void saveAbility(@RequestBody Classes _class) {
            classesService.saveClass(_class);
    }

    @GetMapping(path = "/name/{name}")
    public Classes getClassByName(@PathVariable String name) {
        LOGGER.info("Retrieving class with the name: " + name);
        return classesService.getClassByName(name);
    }

}
