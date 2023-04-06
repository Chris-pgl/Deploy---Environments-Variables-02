package com.example.Deploy.Environments.Variables2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prova")
public class Controller {

    @Value("${welcomeMsg}")
    private String hello;

    @GetMapping("/change")
    public String sayHelloDifferent(){
        return hello;
    }

}
