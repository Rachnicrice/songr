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
        return "index";
    }

    @GetMapping("/albums")
    public String albums (Model m) {
        Album[] albums = new Album[] {
            new Album("Fear Inoculum", "Tool", 10, 5198, "https://en.wikipedia.org/wiki/Fear_Inoculum#/media/File:Tool_-_Fear_Inoculum.png"),
            new Album ("Stromata", "Charlotte Martin", 12, 3284, "I'll save images to assets eventually"),
            new Album ("Rumors", "Fleetwood Mac", 11, 2383, "This is a great album")
        };
        m.addAttribute("albums", albums);
        return "albums";
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
