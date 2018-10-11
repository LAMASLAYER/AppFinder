package com.appfinder.components.charfeats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharFeatsServiceImpl implements CharFeatsService {


    private final CharFeatsRepository charFeatsRepository;

    @Autowired
    public CharFeatsServiceImpl(CharFeatsRepository charFeatRepository) {
        this.charFeatsRepository = charFeatRepository;
    }

    @Override
    public List<CharFeats> getByCharId(Integer charId) {
        return charFeatsRepository.findByCharId(charId);
    }

    @Override
    public void saveCharFeat(CharFeats charFeat) {
        charFeatsRepository.save(charFeat);
    }



}
