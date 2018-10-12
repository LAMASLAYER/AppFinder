package com.appfinder.components.abilities;

import java.util.List;

public interface AbilitiesService {
    Abilities getAbilityById(Integer abilityId);
    void saveAbility(Abilities ability);
    List<Abilities> getAllAbilities();
    Abilities getAbilityByName(String name);
    List<Abilities> getAbilitiesByIdIn(Integer[] ids);
}
