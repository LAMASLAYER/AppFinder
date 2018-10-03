package com.appfinder.components.geartype;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class GearType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int gearTypeId;
    private String name;
    private String description;

    public int getGearTypeId() {
        return gearTypeId;
    }

    public void setGearTypeId(int gearId) {
        this.gearTypeId = gearId;
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
}
