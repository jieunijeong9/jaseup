package com.example.jaseup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/article")
    public String index(){
        return "articles/index";
    }
}
