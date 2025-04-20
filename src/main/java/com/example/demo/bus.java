package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class bus {

    @GetMapping("/bus")
    public String getData() { return " Please your bus " ;}
}