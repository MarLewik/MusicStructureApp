package com.example.marlew.musicstructureapp;

public class Song {

    private String songName;
    private String artistName;

    public Song(String sName, String aName) {
        songName = sName;
        artistName = aName;
    }


    public String getSongName() {
        return songName;
    }
    public String getArtistName() {
        return artistName;
    }

}
