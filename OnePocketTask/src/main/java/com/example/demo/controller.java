package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@GetMapping("onepocket")
    public String helloWorld() {
        return "Hello world!";
    }

}
