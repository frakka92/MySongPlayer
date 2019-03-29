package com.example.android.mysongplayer;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {

    public static final String INTENT_KEY_NAME_PLAYLIST = "playlistName";
    public static final String INTENT_KEY_NAME_TITLE = "title";
    public static final String INTENT_KEY_NAME_ARTIST = "artist";
    public static final String INTENT_KEY_NAME_ALBUMID = "albumID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        String playlistName,title,artist;
        int album;

        //I get the extras if exist otherwise it will throw a NullPointerException and the app will crash
        if(getIntent().getExtras() != null){
            playlistName = getIntent().getExtras().getString(INTENT_KEY_NAME_PLAYLIST);
            //Log.v("SongActivity_playlist", playlistName);

            title = getIntent().getExtras().getString(INTENT_KEY_NAME_TITLE);
            //Log.v("SongActivity_title", title);

            ActionBar ab = getSupportActionBar();
            ab.setTitle(title);

            artist = getIntent().getExtras().getString(INTENT_KEY_NAME_ARTIST);
            //Log.v("SongActivity_artist", artist);

            album = getIntent().getExtras().getInt(INTENT_KEY_NAME_ALBUMID);
            //Log.v("SongActivity_albumID", Integer.toString(album));

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
}
