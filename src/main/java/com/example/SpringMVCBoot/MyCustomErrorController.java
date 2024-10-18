package com.example.SpringMVCBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//@RestController
@Controller
public class MyCustomErrorController {
    private static final String PATH = "/error";
    
    @GetMapping("/error1")
    public String error() {
        //return "Error haven";
        System.out.println("Helloooo111111111111111111 !");
        //return String.format("Hello %s!", "jlklk");
        return "greeting";
    }
}
