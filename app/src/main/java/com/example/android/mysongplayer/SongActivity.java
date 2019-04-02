package com.example.android.mysongplayer;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.mysongplayer.Constants.*;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        String playlistName, title, artist;
        int album;

        //I get the extras if exist otherwise it will throw a NullPointerException and the app will crash
        if (getIntent().getExtras() != null) {
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

        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(SongActivity.this, MainActivity.class);
                startActivity(mainIntent);
            }
        });
    }
}
