package com.example.marlew.musicstructureapp;

public class Song {


    /** Default song name */
    private String songName;

    /** Miwok translation for the word */
    private String artistName;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Song(String sName, String aName) {
        songName = sName;
        artistName = aName;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

}
