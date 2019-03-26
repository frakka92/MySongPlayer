package com.example.android.mysongplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        //I get the playlist name
        final String playlistName = getIntent().getExtras().getString("playlistName");
        // Log.v("PlaylistActivity", playlist.getString("playlistName"));

        final ArrayList<Song> mySongs = new ArrayList<>();

        //I change the objects Song according to the value of playlistName
        if (playlistName.equalsIgnoreCase("francesca 25")) {
            mySongs.add(new Song("L\'amore esiste", "Francesca Michielin", R.drawable.di20are, playlistName));
            mySongs.add(new Song("Un cuore in due", "Francesca Michielin", R.drawable.di20are, playlistName));
            mySongs.add(new Song("25 febbraio", "Francesca Michielin", R.drawable.di20are, playlistName));
            mySongs.add(new Song("Io Non Abito Al Mare", "Francesca Michielin", R.drawable.a2640, playlistName));
            mySongs.add(new Song("Bolivia", "Francesca Michielin", R.drawable.a2640, playlistName));
            mySongs.add(new Song("Vulcano", "Francesca Michielin", R.drawable.a2640, playlistName));

        }

        if (playlistName.equalsIgnoreCase("sade")) {
            mySongs.add(new Song("Your love is king", "Sade", R.drawable.sade, playlistName));
            mySongs.add(new Song("Smooth operator", "Sade", R.drawable.sade, playlistName));
            mySongs.add(new Song("Hang on to your love", "Sade", R.drawable.sade, playlistName));
            mySongs.add(new Song("Is it a crime", "Sade", R.drawable.sade, playlistName));
            mySongs.add(new Song("King of sorrow", "Sade", R.drawable.sade, playlistName));
        }

        SongAdapter mySongAdapter = new SongAdapter(this, mySongs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(mySongAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent songIntent = new Intent(PlaylistActivity.this, SongActivity.class);
                Bundle b = new Bundle();
                //b.putInt("position", position);

                //I need the information of the clicked object to display them in SongActivity
                b.putString("title", mySongs.get(position).getmTitle());
                b.putString("artist", mySongs.get(position).getmArtist());
                b.putInt("albumID", mySongs.get(position).getmAlbumCoverID());
                b.putString("playlistName", mySongs.get(position).getPlaylist());
                //Log.v("Playlist_albumID", Integer.toString(mySongs.get(position).getmAlbumCoverID()));
                songIntent.putExtras(b);
                startActivity(songIntent);
            }
        });
    }
}
