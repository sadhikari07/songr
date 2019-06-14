package com.sudadh.code401javaSongr.songrLab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController{

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    @GetMapping("/song")
    public String songInfo(Model m) {
        Iterable<Song> songList = songRepository.findAll();
        m.addAttribute("song", songList);
        return "song";
    }

    @PostMapping(value = "/song/add")
    public RedirectView addSong(@RequestParam String title,  int length, int trackNumber, String album) {
        List<Album> songWithThatAlbum = albumRepository.findByName(album);


        if(songWithThatAlbum.size() > 0) {
            Song song = new Song(title, length, trackNumber, songWithThatAlbum.get(0));
            songRepository.save(song);
            return new RedirectView("/song");
        } else {

             Album albumToAdd = new Album(title, "someone", 1, length, "someUrl");
            Song song = new Song(title, length, trackNumber, albumToAdd);
            albumRepository.save(albumToAdd);
            songRepository.save(song);
            return new RedirectView("/song");}
    }
}