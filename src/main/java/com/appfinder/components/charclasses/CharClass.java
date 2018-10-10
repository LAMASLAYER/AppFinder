package com.appfinder.components.charclasses;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CharClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int charClassId;
    private int charId;
    private int classId;
    private int classLevel;

    public int getCharClassId() {
        return charClassId;
    }

    public void setCharClassId(int charClassId) {
        this.charClassId = charClassId;
    }

    public int getCharId() {
        return charId;
    }

    public void setCharId(int charId) {
        this.charId = charId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(int classLevel) {
        this.classLevel = classLevel;
    }
}
