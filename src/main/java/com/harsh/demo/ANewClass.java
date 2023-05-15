package com.harsh.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ANewClass {
    @RequestMapping("/new")
    public String message(){
        return "congratulations on first springboot application";
    }


}
