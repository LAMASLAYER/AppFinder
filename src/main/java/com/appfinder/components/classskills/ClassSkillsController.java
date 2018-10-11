package com.appfinder.components.classskills;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/classSkills")
public class ClassSkillsController {

    private static final Logger LOGGER = Logger.getLogger(ClassSkillsController.class);

    private final ClassSkillsRepository classSkillsRepository;
    private final ClassSkillsService classSkillsService;

    @Autowired
    public ClassSkillsController(ClassSkillsRepository classSkillsRepository, ClassSkillsService classSkillsService) {
        this.classSkillsRepository = classSkillsRepository;
        this.classSkillsService = classSkillsService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<ClassSkills> getAllClassSkills() {
        LOGGER.info("Retrieving All class skills...");
        return classSkillsRepository.findAll();
    }

    @GetMapping(path = "/classSkillId/{classSkillId}")
    public ClassSkills getClassSkillsById(@PathVariable int classSkillId) {
        LOGGER.info("Retrieving classSkill with the id: " + classSkillId);
        return classSkillsService.getClassSkillById(classSkillId);
    }

    @PostMapping(path = "/post")
    public void saveClassSkill(@RequestBody ClassSkills classSkill) {
            classSkillsService.saveClassSkill(classSkill);
    }

    @GetMapping(path = "/classId/{classId}")
    public List<ClassSkills> getClassById(@PathVariable int classId) {
        LOGGER.info("Retrieving classSkills with the class id: " + classId);
        return classSkillsService.getByClassId(classId);
    }
}
