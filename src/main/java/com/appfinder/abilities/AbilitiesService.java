package com.appfinder.abilities;

import java.util.List;

public interface AbilitiesService {
    Abilities getAbilityById(Integer abilityId);
    void saveAbility(Abilities ability);
    List<Abilities> getAllAbilities();
    Abilities getAbilityByName(String name);
}
