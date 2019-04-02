package com.appfinder.data.assets.album;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int albumId;
    private String album;


    public int getAlbumIdId() {
        return albumId;
    }

    public void setAlbumIdId(int assetId) {
        this.albumId = assetId;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
