package com.example.android.mysongplayer;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    static class ViewHolder {
        public TextView titleHolder, artistHolder; // playlistHolder;
        public ImageView albumHolder;
    }

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
            listView = LayoutInflater.from(getContext()).inflate(R.layout.song_listitem, parent, false);

            /* I user a view holder where I store my variables in song_listitem.xml
            because it's faster than using findViewById methd or XML inflating
             */
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.titleHolder = listView.findViewById(R.id.title_song);
            viewHolder.artistHolder = listView.findViewById(R.id.artist_song);
            //viewHolder.playlistHolder = listView.findViewById(R.id.playlist_from);
            viewHolder.albumHolder = listView.findViewById(R.id.album_song);
            listView.setTag(viewHolder);
        }

        //get the current song with the method getItem
        Song currentSong = getItem(position);

        ViewHolder holder = (ViewHolder) listView.getTag();
        //Log.v("getmTitle_SongAdapter", currentSong.getmTitle());
        holder.titleHolder.setText(currentSong.getmTitle());

        //Log.v("getmArtist_SongAdapter", currentSong.getmArtist());
        holder.artistHolder.setText(currentSong.getmArtist());

        //Log.v("getmAlbum_SongAdapter", Integer.toString(currentSong.getmAlbumCoverID()));
        holder.albumHolder.setImageResource(currentSong.getmAlbumCoverID());

        /*
        Note: I don't need the playlist because there isn't in song_listitem
         */

        //Log.v("getmPlaylistSongAdapter", currentSong.getmPlaylist());
        //holder.playlistHolder.setText(currentSong.getmPlaylist());

        return listView;
    }
}
