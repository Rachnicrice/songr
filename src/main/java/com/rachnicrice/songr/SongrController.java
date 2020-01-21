package com.rachnicrice.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongrController {

    @GetMapping("/hello")
    public String sayHello (Model m) {

        return "hello";
    }
}
