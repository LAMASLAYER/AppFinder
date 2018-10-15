package com.appfinder.data.assets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetsServiceImpl implements AssetsService {


    private final AssetsRepository assetsRepository;

    @Autowired
    public AssetsServiceImpl(AssetsRepository assetsRepository) {
        this.assetsRepository = assetsRepository;
    }

    @Override
    public Assets getAssetsById(Integer assetsId) {
        return assetsRepository.findOne(assetsId);
    }

    @Override
    public void saveAssets(Assets assets) {
        assetsRepository.save(assets);
    }

    @Override
    public List<Assets> getAllAssets() {
        return assetsRepository.findAll();
    }

    @Override
    public List<Assets> getByCategory(String category) { return assetsRepository.findByCategory(category); }

}
