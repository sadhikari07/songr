package com.sudadh.code401javaSongr.songrLab;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/album")
    public String albumInfo(Model m) {
        Iterable<Album> songAlbum = albumRepository.findAll();
        m.addAttribute("album", songAlbum);
        return "album";
    }


    @PostMapping(value = "/album/add")
    public RedirectView addAlbum(@RequestParam String title, String artist, int songCount, int songLength, String imageUrl) {
        Album newAlbum = new Album(title, artist, songCount, songLength, imageUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("/album");
    }

}

