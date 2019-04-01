package com.appfinder.data.assets.album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {


    private final AlbumRepository albumRepository;

    @Autowired
    public AlbumServiceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public Album getAlbumById(Integer albumId) {
        return albumRepository.findOne(albumId);
    }

    @Override
    public List<Album> getByAlbum(String album) { return albumRepository.findByAlbum(album); }

}
