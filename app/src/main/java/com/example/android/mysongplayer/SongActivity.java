package com.example.android.mysongplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        //I get the
        Bundle playlistIntentExtras = getIntent().getExtras();

        String playlistName = playlistIntentExtras.getString("playlistName");
        //Log.v("SongActivity_playlist", playlistName);

        //int position = playlistIntentExtras.getInt("position");
        //Log.v("SongActivity_position", Integer.toString(position));

        String title = playlistIntentExtras.getString("title");
        //Log.v("SongActivity_title", title);

        String artist = playlistIntentExtras.getString("artist");
        //Log.v("SongActivity_artist", artist);

        int album = playlistIntentExtras.getInt("albumID");
        //Log.v("SongActivity_albumID", Integer.toString(album));

        setContentView(R.layout.activity_song);

        TextView playlistTextView = findViewById(R.id.playlist_from);
        playlistTextView.setText(playlistName);

        ImageView albumTextView = findViewById(R.id.albumID);
        albumTextView.setImageResource(album);

        TextView titleTextView = findViewById(R.id.title);
        titleTextView.setText(title);

        TextView artistTextView = findViewById(R.id.artist);
        artistTextView.setText(artist);
    }
}
