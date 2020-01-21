package com.rachnicrice.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SongrController {


    @GetMapping ("/")
    public String home (Model m) {
        return "home";
    }

    @GetMapping("/hello")
    public String sayHello (Model m) {
        return "hello";
    }

    @GetMapping("/capitalize/{input}")
    public  String capitalize (@PathVariable String input, Model m) {
        m.addAttribute("input", input.toUpperCase());
        return "all-caps";
    }
}
