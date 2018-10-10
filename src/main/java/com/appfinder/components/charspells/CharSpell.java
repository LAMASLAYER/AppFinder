package com.appfinder.components.charspells;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CharSpell {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int charSpellId;
    private int charId;
    private int spellId;

    public int getCharSpellId() {
        return charSpellId;
    }

    public void setCharSpellId(int charSpellId) {
        this.charSpellId = charSpellId;
    }

    public int getCharId() {
        return charId;
    }

    public void setCharId(int charId) {
        this.charId = charId;
    }

    public int getSpellId() {
        return spellId;
    }

    public void setSpellId(int spellId) {
        this.spellId = spellId;
    }
}
