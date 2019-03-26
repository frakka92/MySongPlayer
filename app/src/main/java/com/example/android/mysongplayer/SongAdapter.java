package com.example.android.mysongplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context       The current context. Used to inflate the layout file.
     * @param songArrayList A List of Song objects to display in a list
     */

    public SongAdapter(Context context, ArrayList<Song> songArrayList) {
        super(context, 0, songArrayList);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listView = convertView;
        if (listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(R.layout.song_item, parent, false);
        }

        //get the current song with the method getItem
        Song currentSong = getItem(position);

        TextView titleTextView = listView.findViewById(R.id.title_song);
        titleTextView.setText(currentSong.getmTitle());

        TextView artistTextView = listView.findViewById(R.id.artist_song);
        artistTextView.setText(currentSong.getmArtist());

        ImageView albumImage = listView.findViewById(R.id.album_song);
        albumImage.setImageResource(currentSong.getmAlbumCoverID());

        return listView;
    }
}
