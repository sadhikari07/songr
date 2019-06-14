package com.sudadh.code401javaSongr.songrLab;

import javax.persistence.*;
import java.util.List;


@Entity
public class Song {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;


    String title;
    int length;
    int trackNumber;


     //name of this variable matches mappedBy in Language.java
    @ManyToOne
    Album album;



    public Song() {}

    public Song(String title,  int length, int trackNumber, Album album) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.album = album;
    }

    public long getId(){
        return id;
    }


    public String getTitle() {
        return title;
    }


    public int getLength() {
        return length;
    }

    public Album getAlbum() {
        return album;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public void setLength(int length) {
        this.length = length;
    }

    public void setTrackNumber() {
        this.trackNumber = trackNumber;
    }

    public void setAlbum(){
        this.album = album;
    }


}
