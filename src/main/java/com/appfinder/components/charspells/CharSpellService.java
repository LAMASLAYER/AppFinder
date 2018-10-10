package com.appfinder.components.charspells;


import java.util.List;

public interface CharSpellService {
    List<CharSpell> getByCharId(Integer charId);
    void saveCharSpell(CharSpell charSpell);
}
