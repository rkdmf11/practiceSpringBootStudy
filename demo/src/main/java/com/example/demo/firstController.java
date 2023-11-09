package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class firstController {
    @GetMapping("first")
    public String hello(){
//        model.addAttribute("data", "hello!!");
        return "firstPage";
    }
}
