package com.imodeng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docker")
public class HomeController {

    @GetMapping("/hello-docker")
    public String helloDocker()
    {
        return "Hello Docker";
    }
}
