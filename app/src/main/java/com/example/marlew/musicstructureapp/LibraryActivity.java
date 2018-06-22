package com.example.marlew.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        ArrayList<Song> songs = new ArrayList<>();

        //Table of 400 songs
        for (int i=1; i<20; i++)
            for (int j=1; j<20; j++)
                songs.add(new Song("song"+i, "artist"+j));


        // Find the View that shows the play category
        TextView play = (TextView) findViewById(R.id.play);
        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent playIntent = new Intent(LibraryActivity.this, PlayActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });
        // Find the View that shows the play category
        TextView main = (TextView) findViewById(R.id.main);
        // Set a click listener on that View
        main.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent mainIntent = new Intent(LibraryActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(mainIntent);
            }
        });

        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
