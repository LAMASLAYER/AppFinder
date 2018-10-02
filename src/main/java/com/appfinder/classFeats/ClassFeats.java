package com.appfinder.classFeats;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ClassFeats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int classFeatId;
    private int classId;
    private String name;
    private int type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getClassFeatId() {
        return classFeatId;
    }

    public void setClassFeatId(int classFeatId) {
        this.classFeatId = classFeatId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

}
