package com.appfinder.components.charwealth;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CharWealth {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int charWealthId;
    private int charId;
    private int wealthId;

    public int getCharWealthId() {
        return charWealthId;
    }

    public void setCharWealthId(int charWealthId) {
        this.charWealthId = charWealthId;
    }

    public int getCharId() {
        return charId;
    }

    public void setCharId(int charId) {
        this.charId = charId;
    }

    public int getWealthId() {
        return wealthId;
    }

    public void setWealthId(int wealthId) {
        this.wealthId = wealthId;
    }
}
