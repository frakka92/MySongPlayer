package com.example.android.mysongplayer;

/**
 * {@link Song} represents the song.
 * Each song has title, artist name and an image resource ID
 */
public class Song {

    //Title of the song
    private String mTitle;

    //Artist name of the song
    private String mArtist;

    //Image resource ID of the album
    private int mAlbumCoverID;

    //playlist where the song is
    private String mPlaylist;

    /**
     * Create a new song object
     *
     * @param mTitle        is title of the song
     * @param mArtist       is the name of the artist
     * @param mAlbumCoverID is the image of the song's album
     * @param mPlaylist     playlist of the song
     */
    public Song(String mTitle, String mArtist, int mAlbumCoverID, String mPlaylist) {
        this.mTitle = mTitle;
        this.mArtist = mArtist;
        this.mAlbumCoverID = mAlbumCoverID;
        this.mPlaylist = mPlaylist;
    }

    /**
     * @return the title of the song
     */
    public String getmTitle() {
        return mTitle;
    }

    /**
     * @return the name of the artist
     */
    public String getmArtist() {
        return mArtist;
    }

    /**
     * @return the Id of the resource image that represents the album
     */
    public int getmAlbumCoverID() {
        return mAlbumCoverID;
    }

    public String getmPlaylist() {
        return mPlaylist;
    }

}
