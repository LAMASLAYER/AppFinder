package com.appfinder.components.racestraits;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RacesTraits {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int raceTraitId;
    private int raceId;
    private String name;
    private String description;
    private Integer modifier;
    private Integer abilityId;

    public int getRaceTraitId() {
        return raceTraitId;
    }

    public void setRaceTraitId(int raceTraitId) {
        this.raceTraitId = raceTraitId;
    }

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
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

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public Integer getAbilityId() {
        return abilityId;
    }

    public void setAbilityId(Integer abilityId) {
        this.abilityId = abilityId;
    }
}
