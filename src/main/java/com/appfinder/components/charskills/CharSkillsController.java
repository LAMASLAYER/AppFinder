package com.appfinder.components.charskills;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/charSkill")
public class CharSkillsController {

    private static final Logger LOGGER = Logger.getLogger(CharSkillsController.class);
    private final CharSkillsRepository charSkillsRepository;
    private final CharSkillsService charSkillsService;

    @Autowired
    public CharSkillsController(CharSkillsRepository charSkillRepository, CharSkillsService charSkillService) {
        this.charSkillsRepository = charSkillRepository;
        this.charSkillsService = charSkillService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<CharSkills> getAllCharSkill() {
        LOGGER.info("Retrieving CharSkillType...");
        return charSkillsRepository.findAll();
    }



    @GetMapping(path = "/charId/{charId}")
    public List<CharSkills> getCharSkillById(@PathVariable int charId) {
        LOGGER.info("Retrieving CharSkill with the id: " + charId);
        return charSkillsService.getByCharId(charId);
    }

    @PostMapping(path = "/post")
    public void saveCharSkill(@RequestBody CharSkills charSkill) {
        LOGGER.info("Saving CharSkillType " + charSkill);
        charSkillsService.saveCharSkill(charSkill);
    }



}
