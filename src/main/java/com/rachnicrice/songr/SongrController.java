package com.rachnicrice.songr;

import com.rachnicrice.songr.model.Album;
import com.rachnicrice.songr.model.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class SongrController {

    @Autowired
    AlbumRepository repo;

    @GetMapping ("/")
    public String home (Model m) {
        return "index";
    }

    @GetMapping("/albums")
    public String albums (Model m) {
        List<Album> albumEntry = repo.findAll();
        m.addAttribute("albums", albumEntry);
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
