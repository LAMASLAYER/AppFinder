package com.appfinder.data.tables.abilitymodifier;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/modifierTable")
public class ModifierTableController {

    private static final Logger LOGGER = Logger.getLogger(ModifierTableController.class);
    private final ModifierTableService modifierTableService;

    @Autowired
    public ModifierTableController(ModifierTableService modifierTableService) {
        this.modifierTableService = modifierTableService;
    }



    @GetMapping(path = "/modifierTableId/{modifierTableId}")
    public int getCharSkillById(@PathVariable int modifierTableId) {
        LOGGER.info("Retrieving matrix value of position: " + modifierTableId);
        return modifierTableService.getById(modifierTableId);
    }




}
