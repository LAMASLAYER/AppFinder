package com.appfinder.components.charwealth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CharWealthServiceImpl implements CharWealthService {


    private final CharWealthRepository charWealthRepository;

    @Autowired
    public CharWealthServiceImpl(CharWealthRepository charWealthRepository) {
        this.charWealthRepository = charWealthRepository;
    }

    @Override
    public CharWealth getByCharId(Integer charId) {
        return charWealthRepository.findByCharId(charId);
    }

    @Override
    public void saveCharWealth(CharWealth charWealth) {
        charWealthRepository.save(charWealth);
    }



}
