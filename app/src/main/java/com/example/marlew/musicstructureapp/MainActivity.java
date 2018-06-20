package com.example.marlew.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        // Find the View that shows the play category
        TextView play = (TextView) findViewById(R.id.play);
        // Set a click listener on that View
        play.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent playIntent = new Intent(MainActivity.this, PlayActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });
        // Find the View that shows the search category
        TextView search = (TextView) findViewById(R.id.search);
        // Set a click listener on that View
        search.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the search category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SearchActivity}
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                // Start the new activity
                startActivity(searchIntent);
            }
        });
        // Find the View that shows the library category
        TextView library = (TextView) findViewById(R.id.library);
        // Set a click listener on that View
        library.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link LibraryActivity}
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);
                // Start the new activity
                startActivity(libraryIntent);
            }
        });
        // Find the View that shows the settings
        TextView settings = (TextView) findViewById(R.id.settings);
        // Set a click listener on that View
        settings.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SettingsActivity}
                Intent settingsIntent = new Intent(MainActivity.this, SettingsActivity.class);
                // Start the new activity
                startActivity(settingsIntent);
            }
        });
    }
}
