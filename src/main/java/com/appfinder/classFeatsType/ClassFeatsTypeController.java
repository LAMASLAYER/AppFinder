package com.appfinder.classFeatsType;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/classFeatsType")
public class ClassFeatsTypeController {

    private static final Logger LOGGER = Logger.getLogger(ClassFeatsTypeController.class);

    private final ClassFeatsTypeRepository classFeatsTypeRepository;
    private final ClassFeatsTypeService classFeatsTypeService;

    @Autowired
    public ClassFeatsTypeController(ClassFeatsTypeRepository classFeatsTypeRepository, ClassFeatsTypeService classFeatsTypeService) {
        this.classFeatsTypeRepository = classFeatsTypeRepository;
        this.classFeatsTypeService = classFeatsTypeService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<ClassFeatsType> getAllClassFeatsType() {
        LOGGER.info("Retrieving All class feats type...");
        return classFeatsTypeRepository.findAll();
    }

    @GetMapping(path = "/classFeatsTypeId/{classFeatsTypeId}")
    public ClassFeatsType getClassFeatsTypeById(@PathVariable int classFeatsTypeId) {
        LOGGER.info("Retrieving classFeatType with the id: " + classFeatsTypeId);
        return classFeatsTypeService.getByClassFeatsTypeId(classFeatsTypeId);
    }

    @PostMapping(path = "/post")
    public void saveAbility(@RequestBody ClassFeatsType classFeat) {
            classFeatsTypeService.saveClassFeatType(classFeat);
    }

    @GetMapping(path = "/name/{name}")
    public ClassFeatsType getClassFeatsTypeByName(@PathVariable String name) {
        LOGGER.info("Retrieving the class feat type with the name: " + name);
        return classFeatsTypeService.getByName(name);
    }

    @GetMapping(path = "/shortNm/{shortNm}")
    public ClassFeatsType getClassFeatsTypeByType(@PathVariable String shortNm) {
        LOGGER.info("Retrieving the class feat type with the short name : " + shortNm);
        return classFeatsTypeService.getByShortName(shortNm);
    }
}
