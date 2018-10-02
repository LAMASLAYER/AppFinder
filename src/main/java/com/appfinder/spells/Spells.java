package com.appfinder.spells;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Spells {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int spellId;
    private String name;
    private String description;
    private String damages;
    private String attackRange;
    private String duration;
    private String savingThrow;
    private String castingTime;
    private String target;
    private String school;
    private Integer level;
    private String casterClass;
    private String spellResistance;
    private String domain;
    private String subDomain;
    private String components;

    public int getSpellId() {
        return spellId;
    }

    public void setSpellId(int spellId) {
        this.spellId = spellId;
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

    public String getDamages() {
        return damages;
    }

    public void setDamages(String damages) {
        this.damages = damages;
    }

    public String getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(String attackRange) {
        this.attackRange = attackRange;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSavingThrow() {
        return savingThrow;
    }

    public void setSavingThrow(String savingThrow) {
        this.savingThrow = savingThrow;
    }

    public String getCastingTime() {
        return castingTime;
    }

    public void setCastingTime(String castingTime) {
        this.castingTime = castingTime;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCasterClass() {
        return casterClass;
    }

    public void setCasterClass(String casterClass) {
        this.casterClass = casterClass;
    }

    public String getSpellResistance() {
        return spellResistance;
    }

    public void setSpellResistance(String spellResistance) {
        this.spellResistance = spellResistance;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getSubdomain() {
        return subDomain;
    }

    public void setSubdomain(String subdomain) {
        this.subDomain = subdomain;
    }

    public String getComponents() {
        return components;
    }

    public void setComponents(String components) {
        this.components = components;
    }



}
