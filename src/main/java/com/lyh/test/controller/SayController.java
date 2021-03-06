package com.lyh.test.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class SayController {

    @GetMapping("/{name}")
    public String name(@PathVariable("name") String name){
        return "say, " + name;
    }
}
