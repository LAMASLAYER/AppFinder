package com.appfinder.data.assets.album;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/album")
public class AlbumController {

    private static final Logger LOGGER = Logger.getLogger(AlbumController.class);

    private final AlbumRepository albumRepository;
    private final AlbumService albumService;

    @Autowired
    public AlbumController(AlbumRepository albumRepository, AlbumService albumService) {
        this.albumRepository = albumRepository;
        this.albumService = albumService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<Album> getAllAlbum() {
        LOGGER.info("Retrieving albums...");
        return albumRepository.findAll();
    }

    @PostMapping(path = "/post")
    public void saveAssets(@RequestBody Album album) {
        LOGGER.info("Saving album " + album);
        albumService.saveAlbum(album);
    }

    @GetMapping(path = "/albumId/{albumId}")
    public Album getAlbumById(@PathVariable int albumId) {
        LOGGER.info("Retrieving album with the id: " + albumId);
        return albumService.getAlbumById(albumId);
    }

    @GetMapping(path = "album/{album}")
    public List<Album> getByAlbum(@PathVariable String album) {
        LOGGER.info("Retrieving album:" + album);
        return albumService.getByAlbum(album);
    }

    @GetMapping(path = "category/{category}")
    public List<Album> getByCategory(@PathVariable String category) {
        LOGGER.info("Retrieving albums with the category:" + category);
        return albumService.getByCategory(category);
    }
}
