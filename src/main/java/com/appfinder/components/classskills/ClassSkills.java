package com.appfinder.components.classskills;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ClassSkills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int classSkillId;
    private int skillId;
    private int classId;

    public int getClassSkillId() {
        return classSkillId;
    }

    public void setClassSkillId(int classSkillId) {
        this.classSkillId = classSkillId;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

}
