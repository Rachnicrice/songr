package com.rachnicrice.songr.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    //instance variables
    private String title;
    private String artist;
    private int songCount;
    private int length;
    private String img;

    //constructor functions

    public Album(String title, String artist, int songCount, int length, String img) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.img = img;
    }
    //default constructor

    public Album () {};

    //instance methods
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getLength() {
        return length;
    }

    public String getImg() {
        return img;
    }
}