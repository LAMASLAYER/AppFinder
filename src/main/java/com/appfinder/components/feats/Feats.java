package com.appfinder.components.feats;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Feats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int featId;
    private String name;
    private String description;
    private String special;
    private String type;

    public int getFeatId() {
        return featId;
    }

    public void setFeatId(int featId) {
        this.featId = featId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
