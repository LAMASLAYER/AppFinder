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
                    + "<a href='/users/getPlayers'>Players</a><br/>";
        }
}
