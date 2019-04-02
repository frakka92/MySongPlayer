package com.example.android.mysongplayer;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

import static com.example.android.mysongplayer.Constants.*;

public class PlaylistActivity extends AppCompatActivity {


    public static String playlistName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

         //I get the playlist name checking if exists otherwise it will throw a NullPointerException and the app will crash
        if (getIntent().getExtras() != null){
            playlistName = getIntent().getExtras().getString(INTENT_KEY_NAME_PLAYLIST);
            // Log.v("PlaylistActivity", playlistName);
            ActionBar ab = getSupportActionBar();
            ab.setTitle(playlistName);
        }

        final ArrayList<Song> mySongs = new ArrayList<>();

        //I change the objects Song according to the value of playlistName
        //Francesca Michielin Playlist
        if (playlistName.equalsIgnoreCase(getString(R.string.playlist1))) {
            mySongs.add(new Song(getString(R.string.amore_esite), getString(R.string.francesca_michielin), R.drawable.di20are, playlistName));
            mySongs.add(new Song(getString(R.string.un_cuore_in_due), getString(R.string.francesca_michielin), R.drawable.di20are, playlistName));
            mySongs.add(new Song(getString(R.string.venti5_febbraio), getString(R.string.francesca_michielin), R.drawable.di20are, playlistName));
            mySongs.add(new Song(getString(R.string.io_non_abito_al_mare), getString(R.string.francesca_michielin), R.drawable.a2640, playlistName));
            mySongs.add(new Song(getString(R.string.bolivia), getString(R.string.francesca_michielin), R.drawable.a2640, playlistName));
            mySongs.add(new Song(getString(R.string.vulcano), getString(R.string.francesca_michielin), R.drawable.a2640, playlistName));
        }

        //Sade Playlist
        if (playlistName.equalsIgnoreCase(getString(R.string.playlist2))) {
            mySongs.add(new Song(getString(R.string.your_love_is_king), getString(R.string.sade), R.drawable.sade, playlistName));
            mySongs.add(new Song(getString(R.string.smooth_operator), getString(R.string.sade), R.drawable.sade, playlistName));
            mySongs.add(new Song(getString(R.string.hang_on_to_your_love), getString(R.string.sade), R.drawable.sade, playlistName));
            mySongs.add(new Song(getString(R.string.is_it_a_crime), getString(R.string.sade), R.drawable.sade, playlistName));
            mySongs.add(new Song(getString(R.string.king_of_sorrow), getString(R.string.sade), R.drawable.sade, playlistName));
        }

        //Evanescence Playlist
        if (playlistName.equalsIgnoreCase(getString(R.string.playlist3))) {
            mySongs.add(new Song(getString(R.string.bring_me_to_life), getString(R.string.evanescence), R.drawable.evanescence, playlistName));
            mySongs.add(new Song(getString(R.string.my_immortal), getString(R.string.evanescence), R.drawable.evanescence, playlistName));
        }

        //Queen Playlist
        if (playlistName.equalsIgnoreCase(getString(R.string.playlist4))) {
            mySongs.add(new Song(getString(R.string.we_will_rock_you), getString(R.string.queen), R.drawable.queen, playlistName));
            mySongs.add(new Song(getString(R.string.i_want_it_all), getString(R.string.queen), R.drawable.queen, playlistName));
        }

        //Vasco Rossi Playlist
        if (playlistName.equalsIgnoreCase(getString(R.string.playlist5))) {
            mySongs.add(new Song(getString(R.string.ce_chi_dice_no), getString(R.string.vasco_rossi), R.drawable.vascorossi, playlistName));
            mySongs.add(new Song(getString(R.string.luna_per_te), getString(R.string.vasco_rossi), R.drawable.vascorossi, playlistName));
        }

        //Avenged Sevenfold Playlist
        if (playlistName.equalsIgnoreCase(getString(R.string.playlist6))) {
            mySongs.add(new Song(getString(R.string.remenissions), getString(R.string.a7x), R.drawable.avengedsevenfold, playlistName));
            mySongs.add(new Song(getString(R.string.so_far_away), getString(R.string.a7x), R.drawable.avengedsevenfold, playlistName));
        }

        SongAdapter mySongAdapter = new SongAdapter(this, mySongs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(mySongAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent songIntent = new Intent(PlaylistActivity.this, SongActivity.class);
                Bundle b = new Bundle();

                //I need the information of the clicked object to display them in SongActivity
                b.putString(INTENT_KEY_NAME_TITLE, mySongs.get(position).getmTitle());
                //Log.v("Playlist_title", mySongs.get(position).getmTitle());

                b.putString(INTENT_KEY_NAME_ARTIST, mySongs.get(position).getmArtist());
                //Log.v("Playlist_artist", mySongs.get(position).getmArtist());

                b.putInt(INTENT_KEY_NAME_ALBUMID, mySongs.get(position).getmAlbumCoverID());
                //Log.v("Playlist_albumID", Integer.toString(mySongs.get(position).getmAlbumCoverID()));

                b.putString(INTENT_KEY_NAME_PLAYLIST, mySongs.get(position).getmPlaylist());
                //Log.v("Playlist_playlistName", mySongs.get(position).getmPlaylist());
                songIntent.putExtras(b);
                startActivity(songIntent);
            }
        });
    }
}
