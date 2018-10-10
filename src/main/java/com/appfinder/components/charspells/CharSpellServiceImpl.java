package com.appfinder.components.charspells;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharSpellServiceImpl implements CharSpellService {


    private final CharSpellRepository charSpellRepository;

    @Autowired
    public CharSpellServiceImpl(CharSpellRepository charSpellRepository) {
        this.charSpellRepository = charSpellRepository;
    }

    @Override
    public List<CharSpell> getByCharId(Integer charId) {
        return charSpellRepository.findByCharId(charId);
    }

    @Override
    public void saveCharSpell(CharSpell charSpell) {
        charSpellRepository.save(charSpell);
    }



}
