package com.creek.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/")
    public String  hello(){
        return "index";
    }

    public static void main(String[] args) {
        System.out.println("nihao");
    }
}
