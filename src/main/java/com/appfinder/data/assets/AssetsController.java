package com.appfinder.data.assets;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@RestController
@CrossOrigin
@RequestMapping("/assets")
public class AssetsController {

    private static final Logger LOGGER = Logger.getLogger(AssetsController.class);

    private final AssetsRepository assetsRepository;
    private final AssetsService assetsService;

    @Autowired
    public AssetsController(AssetsRepository assetsRepository, AssetsService assetsService) {
        this.assetsRepository = assetsRepository;
        this.assetsService = assetsService;
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public List<Assets> getAllAssets() {
        LOGGER.info("Retrieving assets...");
        return assetsRepository.findAll();
    }

    @GetMapping(path = "/assetsId/{assetsId}")
    public Assets getAssetsById(@PathVariable int assetsId) {
        LOGGER.info("Retrieving assets with the id: " + assetsId);
        return assetsService.getAssetsById(assetsId);
    }


    @PostMapping(path = "/post")
    public void saveAssets(@RequestBody Assets assets) {
        LOGGER.info("Saving Assets " + assets);
        assetsService.saveAssets(assets);
    }

    @GetMapping(path = "/category/{category}")
    public List<Assets> getByCategory(@PathVariable String category) {
        LOGGER.info("Retrieving assets with the category:" + category);
        return assetsService.getByCategory(category);
    }

    @GetMapping(path = "/category/{category}/album/{album}")
    public List<Assets>  getByCategoryAndAlbum(@PathVariable String category, @PathVariable String album) {
        LOGGER.info("Retrieving assets with the category:" + category + " and the album" + album);
        return assetsService.getByCategoryAndAlbum(category, album);
    }

    @GetMapping(path = "/category/{category}/orientation/{orientation}")
    public List<Assets>  getByCategoryAndOrientation(@PathVariable String category, @PathVariable String orientation) {
        LOGGER.info("Retrieving assets with the category:" + category + " and the orientation" + orientation);
        return assetsService.getByCategoryAndOrientation(category, orientation);
    }
}
