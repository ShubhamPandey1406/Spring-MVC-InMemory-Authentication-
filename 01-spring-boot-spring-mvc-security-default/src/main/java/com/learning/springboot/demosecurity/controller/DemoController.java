package com.learning.springboot.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/")
    public String showHome()
    {
        return "home";
    }
    //request Mapping for leaders
    @GetMapping("/leaders")
    public String showLeader()
    {
        return "leaders";
    }

    //request Mapping for /System
    @GetMapping("/systems")
    public String showSystem()
    {
        return "systems";
    }
}
