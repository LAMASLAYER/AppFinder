package com.appfinder.components.chargear;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CharGear {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int charGearId;
    private int charId;
    private int gearId;

    public int getCharGearId() {
        return charGearId;
    }

    public void setCharGearId(int charGearId) {
        this.charGearId = charGearId;
    }

    public int getCharId() {
        return charId;
    }

    public void setCharId(int charId) {
        this.charId = charId;
    }

    public int getGearId() {
        return gearId;
    }

    public void setGearId(int gearId) {
        this.gearId = gearId;
    }
}
