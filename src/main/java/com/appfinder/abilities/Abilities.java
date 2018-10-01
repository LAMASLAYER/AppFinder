package com.appfinder.abilities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Abilities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int abilityId;
    private String name;
    private String shortNm;
    private String description;


    public int getAbilityId() {
        return abilityId;
    }

    public void setAbilityId(int abilityId) {
        this.abilityId = abilityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortNm() {
        return shortNm;
    }

    public void setShortNm(String shortNm) {
        this.shortNm = shortNm;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
