package com.appfinder.components.classfeats;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ClassFeats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int classFeatId;
    private int classId;
    private int featId;

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

    public int getFeatId() {
        return featId;
    }

    public void setFeatId(int featId) {
        this.featId = featId;
    }
}
