package com.example.marlew.musicstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {


    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs is the list of {@link Song}s to be displayed.
     */
    public SongAdapter(Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID songname_text_view.
        TextView songTextView = (TextView) listItemView.findViewById(R.id.songname_text_view);
        // Get the songname the currentSong object and set this text on
        // the Song TextView.
        songTextView.setText(currentWord.getSongName());

        // Find the TextView in the list_item.xml layout with the ID artistname_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.artistname_text_view);
        // Get the artistname from the currentSong object and set this text on
        // the artistname TextView.
        defaultTextView.setText(currentWord.getArtistName());

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
