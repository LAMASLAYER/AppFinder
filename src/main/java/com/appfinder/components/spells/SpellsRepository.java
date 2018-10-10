package com.appfinder.components.spells;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpellsRepository extends JpaRepository<Spells, Integer> {
    Spells findByName(String name);
    List<Spells> findByCasterClassAndLevel(String casterClass, Integer level);
    List<Spells> findByCasterClass(String casterClass);
    List<Spells> findByCasterClassAndLevelLessThanEqual(String casterClass, Integer level);
    List<Spells> findBySpellIdIn(Integer[] ids);

}
