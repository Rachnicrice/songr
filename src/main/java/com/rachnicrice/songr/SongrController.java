package com.rachnicrice.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("/capitalize")
    public String capitalize (Model m) {
        return "all-caps";
    }
}
