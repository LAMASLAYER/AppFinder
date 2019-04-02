package com.appfinder.data.assets.album;

import java.util.List;

public interface AlbumService {
    Album getAlbumById(Integer assetsId);
    List<Album> getByAlbum(String album);
    void saveAlbum(Album album);
}
