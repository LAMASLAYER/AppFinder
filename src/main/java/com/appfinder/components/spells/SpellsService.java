package com.appfinder.components.spells;

import java.util.List;

public interface SpellsService {
    Spells getSpellById(Integer spellId);
    void saveSpell(Spells spell);
    List<Spells> getAllSpells();
    Spells getSpellByName(String name);
    List<Spells> getByClassAndLevel(String casterClass, Integer level);
    List<Spells> getByClass(String casterClass);
    List<Spells> getByClassAndLevelLessThanEqual(String casterClass, Integer level);
    List<Spells> getSpellsByIdIn(Integer[] ids);

}
