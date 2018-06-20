package com.example.marlew.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        // Find the View that shows the play category
        TextView library = (TextView) findViewById(R.id.library);
        // Set a click listener on that View
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent libraryIntent = new Intent(SearchActivity.this, LibraryActivity.class);
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
                Intent mainIntent = new Intent(SearchActivity.this, MainActivity.class);
                // Start the new activity
                startActivity(mainIntent);
            }
        });
        // Find the View that shows the play category
        TextView play = (TextView) findViewById(R.id.play);
        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayActivity}
                Intent playIntent = new Intent(SearchActivity.this, PlayActivity.class);
                // Start the new activity
                startActivity(playIntent);
            }
        });
    }



}




