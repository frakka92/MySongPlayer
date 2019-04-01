package com.example.android.mysongplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

import static com.example.android.mysongplayer.Constants.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //I set the onClickListener on the first static playlist
        final TextView francesca25TextView = findViewById(R.id.playlist1);
        francesca25TextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);

                //I want to display the name of the playlist so I need to pass it as Extras
                Bundle b = new Bundle();
                b.putString(INTENT_KEY_NAME_PLAYLIST, francesca25TextView.getText().toString());
                playlistIntent.putExtras(b);
                startActivity(playlistIntent);
            }
        });

        //I set the onClickListener on the second static playlist
        final TextView sadeTextView = findViewById(R.id.playlist2);
        sadeTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                Bundle b = new Bundle();
                b.putString(INTENT_KEY_NAME_PLAYLIST, sadeTextView.getText().toString());
                playlistIntent.putExtras(b);
                startActivity(playlistIntent);
            }
        });

        //I set the onClickListener on the first static playlist
        final TextView evanescenceTextView = findViewById(R.id.playlist3);
        evanescenceTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);

                //I want to display the name of the playlist so I need to pass it as Extras
                Bundle b = new Bundle();
                b.putString(INTENT_KEY_NAME_PLAYLIST, evanescenceTextView.getText().toString());
                playlistIntent.putExtras(b);
                startActivity(playlistIntent);
            }
        });

        //I set the onClickListener on the second static playlist
        final TextView queenTextView = findViewById(R.id.playlist4);
        queenTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                Bundle b = new Bundle();
                b.putString(INTENT_KEY_NAME_PLAYLIST, queenTextView.getText().toString());
                playlistIntent.putExtras(b);
                startActivity(playlistIntent);
            }
        });

        //I set the onClickListener on the first static playlist
        final TextView vascorossiTextView = findViewById(R.id.playlist5);
        vascorossiTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);

                //I want to display the name of the playlist so I need to pass it as Extras
                Bundle b = new Bundle();
                b.putString(INTENT_KEY_NAME_PLAYLIST, vascorossiTextView.getText().toString());
                playlistIntent.putExtras(b);
                startActivity(playlistIntent);
            }
        });

        //I set the onClickListener on the second static playlist
        final TextView avengedSevenfoldTextView = findViewById(R.id.playlist6);
        avengedSevenfoldTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                Bundle b = new Bundle();
                b.putString(INTENT_KEY_NAME_PLAYLIST, avengedSevenfoldTextView.getText().toString());
                playlistIntent.putExtras(b);
                startActivity(playlistIntent);
            }
        });
    }
}
