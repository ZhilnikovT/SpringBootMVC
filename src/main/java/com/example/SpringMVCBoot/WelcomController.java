package com.example.SpringMVCBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//@RestController
@Controller
public class WelcomController {
    @GetMapping("/hello")
    //public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    public String hello() {
        System.out.println("Helloooo !");
        //return String.format("Hello %s!", name);
        return "result";
    }
    
}
