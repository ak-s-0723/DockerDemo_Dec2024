package org.example.dockerdemo_dec2024.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/{name}")
    public String print(@PathVariable String name) {
        return "Hello "+name;
    }
}
