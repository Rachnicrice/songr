package com.rachnicrice.songr;

public class Album {
    //instance variables
    String title;
    String artist;
    int songCount;
    int length;
    String img;

    //constructor function
    public Album(String title, String artist, int songCount, int length, String img) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.img = img;
    }
}
