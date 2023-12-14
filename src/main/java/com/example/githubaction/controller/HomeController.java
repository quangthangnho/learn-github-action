package com.example.githubaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Quang
 */
@RestController
public class HomeController {

    @GetMapping
    public String home() {
        return "Hello World";
    }
}
