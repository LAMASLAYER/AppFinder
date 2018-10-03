package com.appfinder.components.classes;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int classId;
    private String name;
    private String alignment;
    private int hitDie;
    private String startingWealth;
    private int skillsPerLevel;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public int getHitDie() {
        return hitDie;
    }

    public void setHitDie(int hitDie) {
        this.hitDie = hitDie;
    }

    public String getStartingWealth() {
        return startingWealth;
    }

    public void setStartingWealth(String startingWealth) {
        this.startingWealth = startingWealth;
    }

    public int getSkillsPerLevel() {
        return skillsPerLevel;
    }

    public void setSkillsPerLevel(int skillsPerLevel) {
        this.skillsPerLevel = skillsPerLevel;
    }
}
