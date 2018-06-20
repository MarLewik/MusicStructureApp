package com.example.marlew.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        // Find the View that shows the play category
        TextView library = (TextView) findViewById(R.id.library);
        // Set a click listener on that View
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent libraryIntent = new Intent(PlayActivity.this, LibraryActivity.class);
                // Start the new activity
                startActivity(libraryIntent);
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
                Intent mainIntent = new Intent(PlayActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(mainIntent);
            }
        });
        // Find the View that shows the play category
        TextView search = (TextView) findViewById(R.id.search);
        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent searchIntent = new Intent(PlayActivity.this, SearchActivity.class);
                // Start the new activity
                startActivity(searchIntent);
            }
        });
        // Find the View that shows the play category
        TextView settings = (TextView) findViewById(R.id.settings);
        // Set a click listener on that View
        settings.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent settingsIntent = new Intent(PlayActivity.this, SettingsActivity.class);
                // Start the new activity
                startActivity(settingsIntent);
            }
        });
    }
}
