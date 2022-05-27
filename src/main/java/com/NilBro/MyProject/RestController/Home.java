package com.NilBro.MyProject.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class Home {

    @GetMapping(value = "/")
    public String home(){
        return "You are in Home Now";
    }
}
