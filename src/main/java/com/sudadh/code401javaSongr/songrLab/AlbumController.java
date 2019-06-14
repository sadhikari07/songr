package com.sudadh.code401javaSongr.songrLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("/album")
    public String albumInfo(Model m) {
        Iterable<Album> songAlbum = albumRepository.findAll();
        m.addAttribute("album", songAlbum);
        return "album";
    }


    @GetMapping("/song/{id}/randomSong")
    public String getRandomSong(@PathVariable long id, Model m) {
        // .get to get value inside of optional
        Album a = albumRepository.findById(id).get();
        long size = a.getSong().size();
        Song randomSong = a.getSong().get((int)(Math.random() * size));
        m.addAttribute("album", randomSong);
        return "randomSong";
    }



    @PostMapping(value = "/album/add")
    public RedirectView addAlbum(@RequestParam String name, String artist, int songCount, int songLength, String imageUrl) {
        Album newAlbum = new Album(name, artist, songCount, songLength, imageUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("/album");
    }

}


