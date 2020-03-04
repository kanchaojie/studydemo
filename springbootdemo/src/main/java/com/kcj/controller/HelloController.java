package com.kcj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {
   /* @Autowired
    private DataSource dataSource;*/
    @GetMapping("hello")
    public String hello(){
       /* return "hello, spring boot!"+dataSource;*/
        System.out.println("hello method is now running!");
        return "hello, spring boot!";
    }
}
