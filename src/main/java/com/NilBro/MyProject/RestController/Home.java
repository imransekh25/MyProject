package com.NilBro.MyProject.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value= "/")
@RestController
public class Home {

    @GetMapping(value = "/")
    public String home(){
        return "You are in Home Now";
    }
}
