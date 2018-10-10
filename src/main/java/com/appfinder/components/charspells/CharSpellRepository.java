package com.appfinder.components.charspells;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharSpellRepository extends JpaRepository<CharSpell, Integer> {
    List<CharSpell> findByCharId(int charId);
}
