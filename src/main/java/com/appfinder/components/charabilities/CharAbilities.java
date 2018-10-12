package com.appfinder.components.charabilities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CharAbilities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int charAbilityId;
    private int charId;
    private int abilityId;
    private int abilityValue;

    public int getCharId() {
        return charId;
    }

    public void setCharId(int charId) {
        this.charId = charId;
    }

    public int getCharAbilityId() {
        return charAbilityId;
    }

    public void setCharAbilityId(int charAbilityId) {
        this.charAbilityId = charAbilityId;
    }

    public int getAbilityId() {
        return abilityId;
    }

    public void setAbilityId(int abilityId) {
        this.abilityId = abilityId;
    }

    public int getAbilityValue() {
        return abilityValue;
    }

    public void setAbilityValue(int abilityValue) {
        this.abilityValue = abilityValue;
    }
}
