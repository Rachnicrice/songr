package com.rachnicrice.songr;

public class Album {
    //instance variables
    public String title;
    public String artist;
    public int songCount;
    public int length;
    public String img;

    //constructor function
    public Album(String title, String artist, int songCount, int length, String img) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.img = img;
    }
}
