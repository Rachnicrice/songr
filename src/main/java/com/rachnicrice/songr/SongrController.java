package com.rachnicrice.songr;

import com.rachnicrice.songr.model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SongrController {


    @GetMapping ("/")
    public String home (Model m) {
        return "index";
    }

    @GetMapping("/albums")
    public String albums (Model m) {
        Album[] albums = new Album[] {
            new Album("Fear Inoculum", "Tool", 10, 5198, "https://upload.wikimedia.org/wikipedia/en/d/d6/Tool_-_Fear_Inoculum.png"),
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
