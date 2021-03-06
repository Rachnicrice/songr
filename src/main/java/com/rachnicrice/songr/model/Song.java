package com.rachnicrice.songr.model;

import javax.persistence.*;

@Entity
public class Song {
    //instance variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    private String title;
    private int length;
    private int trackNumber;

    @ManyToOne
    Album album;

//Constructors
    public Song(String title, int length, int trackNumber) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public Song () {}

    //instance methods

    public void setAlbum (Album album) {
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }
}
