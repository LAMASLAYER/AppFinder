package com.appfinder.components.feats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeatsServiceImpl implements FeatsService {


    private final FeatsRepository featsRepository;

    @Autowired
    public FeatsServiceImpl(FeatsRepository featsRepository) {
        this.featsRepository = featsRepository;
    }

    @Override
    public Feats getFeatById(Integer featId) {
        return featsRepository.findOne(featId);
    }

    @Override
    public void saveFeat(Feats feat) {
        featsRepository.save(feat);
    }

    @Override
    public List<Feats> getAllFeats() {
        return featsRepository.findAll();
    }

    @Override
    public Feats getFeatByName(String name) { return featsRepository.findByName(name); }

    @Override
    public List<Feats> getByFeatsIdsIn(Integer[] ids) { return featsRepository.findByFeatIdIn(ids); }

}
