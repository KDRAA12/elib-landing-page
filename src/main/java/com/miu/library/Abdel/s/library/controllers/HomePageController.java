package com.miu.library.Abdel.s.library.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping({"/","/elibrary","/elibrary/home"})
    public String home(){
        return "home/index";
    }

}
