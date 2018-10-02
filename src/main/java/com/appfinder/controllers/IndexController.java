package com.appfinder.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/")
    public String index(){
        //mapped to hostname:port/home/index/
            return "Welcome on AppFinder back-end."
                    + "<br/>"
                    + "See Players: "
                    + "<a href='/players/all'>Players</a><br/>"
                    + "See Races: "
                    + "<a href='/races/all'>Races</a><br/>"
                    + "See Characters: "
                    + "<a href='/characters/all'>Characters</a><br/>"
                    + "See Skills: "
                    + "<a href='/skills/all'>Skills</a><br/>"
                    + "See Gear: "
                    + "<a href='/gear/all'>Gear</a><br/>"
                    + "See Gear Types: "
                    + "<a href='/gearType/all'>Gear Types</a><br/>"
                    + "See Abilities: "
                    + "<a href='/abilities/all'>Abilities</a><br/>"
                    + "See Spells: "
                    + "<a href='/spells/all'>Spells</a><br/>"
                    + "See Classes: "
                    + "<a href='/classes/all'>Classes</a><br/>"
                    + "See Class Skills: "
                    + "<a href='/classSkills/all'>Classes Skills</a><br/>"
                    + "See Classes Feats: "
                    + "<a href='/classFeats/all'>Classes Feats</a><br/>"
                    + "See Classes Feats Types: "
                    + "<a href='/classFeatsType/all'>Classes Feats Type</a><br/>";

    }
}
