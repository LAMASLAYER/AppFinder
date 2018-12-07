package com.appfinder.components.charabilities;


import java.util.List;

public interface CharAbilitiesService {
    List<CharAbilities> getByCharId(Integer charId);
    void saveCharAbilities(CharAbilities charAbilities);
    CharAbilities getByAbilityId(int abilityId);
    CharAbilities getByCharAbilityId(int charAbilityId);
    CharAbilities getByCharIdAndAbilityId(int charId, int abilityId);
}
