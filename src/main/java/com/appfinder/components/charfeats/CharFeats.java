package com.appfinder.components.charfeats;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CharFeats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int charFeatId;
    private int charId;
    private int featId;

    public int getCharFeatId() {
        return charFeatId;
    }

    public void setCharFeatId(int charFeatId) {
        this.charFeatId = charFeatId;
    }

    public int getCharId() {
        return charId;
    }

    public void setCharId(int charId) {
        this.charId = charId;
    }

    public int getFeatId() {
        return featId;
    }

    public void setFeatId(int featId) {
        this.featId = featId;
    }
}
