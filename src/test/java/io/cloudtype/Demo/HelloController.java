package com.nhnenterprise.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloController() {
        return "spring boot.. by c type";
    }
}
