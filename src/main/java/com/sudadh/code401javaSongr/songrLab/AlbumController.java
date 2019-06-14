package com.sudadh.code401javaSongr.songrLab;

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

    @Autowired
    SongRepository songRepository;

    @GetMapping("/album")
    public String albumInfo(Model m) {
        Iterable<Album> songAlbum = albumRepository.findAll();
        m.addAttribute("album", songAlbum);
        return "album";
    }



    @GetMapping("/album/{name}")
    public String getThatAlbum( @PathVariable("albumName") String albumName, Model m) {
        Album a = albumRepository.findByName(albumName).get(0);
        m.addAttribute("albumName", a);
        return "songsInOneAlbum";
    }



    @PostMapping(value = "/album/add")
    public RedirectView addAlbum(@RequestParam String name, String artist, int songCount, int songLength, String imageUrl) {
        Album newAlbum = new Album(name, artist, songCount, songLength, imageUrl);
        albumRepository.save(newAlbum);
        return new RedirectView("/album");
    }

}


