package study.datajpa.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    @GetMapping
    public String hello(){
        return "hello";
    }
}
