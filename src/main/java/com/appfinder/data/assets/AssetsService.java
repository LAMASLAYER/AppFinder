package com.appfinder.data.assets;

import java.util.List;

public interface AssetsService {
    Assets getAssetsById(Integer assetsId);
    void saveAssets(Assets assets);
    List<Assets> getAllAssets();
    List<Assets> getByCategory(String category);
    List<Assets> getByCategoryAndAlbum(String category, String album);
    List<Assets> getByCategoryAndOrientation(String category, String orientation);
}
