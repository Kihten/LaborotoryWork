package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public ResponseEntity<String> getName(@RequestParam("name") String firstName){
        String response = "Hello, " + firstName;

        return ResponseEntity.ok().body(response);
    }
}
