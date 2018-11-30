package com.appfinder.components.charabilities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharAbilitiesRepository extends JpaRepository<CharAbilities, Integer> {
    List<CharAbilities> findByCharId(int charId);
    CharAbilities findByAbilityId(int abilityId);
    CharAbilities findByCharAbilityId(int charAbilityId);
}
