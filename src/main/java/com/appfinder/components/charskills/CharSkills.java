package com.appfinder.components.charskills;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CharSkills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int charSkillId;
    private int charId;
    private int skillId;

    public int getCharSkillId() {
        return charSkillId;
    }

    public void setCharSkillId(int charSkillId) {
        this.charSkillId = charSkillId;
    }

    public int getCharId() {
        return charId;
    }

    public void setCharId(int charId) {
        this.charId = charId;
    }

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }
}
