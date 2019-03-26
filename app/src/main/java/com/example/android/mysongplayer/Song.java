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
    private String playlist;

    /**
     * Create a new song object
     *
     * @param mTitle        is title of the song
     * @param mArtist       is the name of the artist
     * @param mAlbumCoverID is the image of the song's album
     * @param playlist      playlist of the song
     */
    public Song(String mTitle, String mArtist, int mAlbumCoverID, String playlist) {
        this.mTitle = mTitle;
        this.mArtist = mArtist;
        this.mAlbumCoverID = mAlbumCoverID;
        this.playlist = playlist;
    }

    /**
     * @return the title of the song
     */
    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    /**
     * @return the name of the artist
     */
    public String getmArtist() {
        return mArtist;
    }

    public void setmArtist(String mArtist) {
        this.mArtist = mArtist;
    }

    /**
     * @return the Id of the resource image that represents the album
     */
    public int getmAlbumCoverID() {
        return mAlbumCoverID;
    }

    public void setmAlbumCoverID(int mAlbumCoverID) {
        this.mAlbumCoverID = mAlbumCoverID;
    }

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }
}
