package com.appfinder.components.chargear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharGearServiceImpl implements CharGearService {


    private final CharGearRepository charGearRepository;

    @Autowired
    public CharGearServiceImpl(CharGearRepository charGearRepository) {
        this.charGearRepository = charGearRepository;
    }

    @Override
    public List<CharGear> getByCharId(Integer charId) {
        return charGearRepository.findByCharId(charId);
    }

    @Override
    public void saveCharGear(CharGear charGear) {
        charGearRepository.save(charGear);
    }



}
