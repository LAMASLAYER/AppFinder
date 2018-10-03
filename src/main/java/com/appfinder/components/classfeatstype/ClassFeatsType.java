package com.appfinder.components.classfeatstype;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ClassFeatsType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int classFeatTypeId;
    private String name;
    private String shortName;
    private String description;

    public int getClassFeatTypeId() {
        return classFeatTypeId;
    }

    public void setClassFeatTypeId(int classFeatTypeId) {
        this.classFeatTypeId = classFeatTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
