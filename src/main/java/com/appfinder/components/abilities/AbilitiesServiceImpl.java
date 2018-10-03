package com.appfinder.components.abilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbilitiesServiceImpl implements AbilitiesService {


    private final AbilitiesRepository abilitiesRepository;

    @Autowired
    public AbilitiesServiceImpl(AbilitiesRepository abilitiesRepository) {
        this.abilitiesRepository = abilitiesRepository;
    }

    @Override
    public Abilities getAbilityById(Integer abilityId) {
        return abilitiesRepository.findOne(abilityId);
    }

    @Override
    public void saveAbility(Abilities ability) {
        abilitiesRepository.save(ability);
    }

    @Override
    public List<Abilities> getAllAbilities() {
        return abilitiesRepository.findAll();
    }

    @Override
    public Abilities getAbilityByName(String name) { return abilitiesRepository.findByName(name); }


}
