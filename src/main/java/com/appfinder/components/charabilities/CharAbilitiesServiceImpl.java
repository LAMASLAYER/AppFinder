package com.appfinder.components.charabilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharAbilitiesServiceImpl implements CharAbilitiesService {


    private final CharAbilitiesRepository charAbilitiesRepository;

    @Autowired
    public CharAbilitiesServiceImpl(CharAbilitiesRepository charAbilitiesRepository) {
        this.charAbilitiesRepository = charAbilitiesRepository;
    }

    @Override
    public List<CharAbilities> getByCharId(Integer charId) {
        return charAbilitiesRepository.findByCharId(charId);
    }

    @Override
    public void saveCharAbilities(CharAbilities charAbilities) {
        charAbilitiesRepository.save(charAbilities);
    }

    @Override
    public CharAbilities getByAbilityId(int abilityId) { return charAbilitiesRepository.findByAbilityId(abilityId); }

}
