package com.appfinder.components.skills;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/skills")
public class SkillsController {

    private static final Logger LOGGER = Logger.getLogger(SkillsController.class);

    private final SkillsRepository skillsRepository;
    private final SkillsService skillsService;

    @Autowired
    public SkillsController(SkillsRepository skillsRepository, SkillsService skillsService) {
        this.skillsRepository = skillsRepository;
        this.skillsService = skillsService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<Skills> getAllSkills() {
        LOGGER.info("Retrieving Spells...");
        return skillsRepository.findAll();
    }

    @GetMapping(path = "/skillId/{skillId}")
    public Skills getSkillsById(@PathVariable int skillId) {
        LOGGER.info("Retrieving skill with the id: " + skillId);
        return skillsService.getSkillById(skillId);
    }

    @PostMapping(path = "/post")
    public void saveSkill(@RequestBody Skills skill) {
            skillsService.saveSkill(skill);
    }

    @GetMapping(path = "/name/{name}")
    public Skills getSkillsByName(@PathVariable String name) {
        LOGGER.info("Retrieving skill with the name: " + name);
        return skillsService.getSkillByName(name);
    }

    @GetMapping(path = "/primaryStat/{primaryStat}")
    public List<Skills> getSkillsByPrimaryStat(@PathVariable String primaryStat) {
        LOGGER.info("Retrieving skills with stat: " + primaryStat);
        return skillsService.getSkillsByPrimaryStat(primaryStat);
    }

    @GetMapping(path = "/charSkill/{ids}")
    public List<Skills> getByIdIn(@PathVariable("ids") Integer[] ids) {
        LOGGER.info("Retrieving Gears with ids of the list " + ids) ;
        return skillsService.getSkillsByIdIn(ids);
    }

}
