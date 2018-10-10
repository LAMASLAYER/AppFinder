package com.appfinder.data.chars;

import java.util.List;

import com.appfinder.components.classes.Classes;
import com.appfinder.components.gear.Gear;
import com.appfinder.components.racestraits.RacesTraits;
import com.appfinder.components.spells.Spells;
import com.appfinder.data.classlevels.ClassLevels;

public class Character {

    private int charId;
    private String race;
    private int age;
    private char gender;
    private String name;
    private int level;
    private String alignment;
    private String deity;
    private int height;
    private String heightUnit;
    private int weight;
    private String weightUnit;
    private List<RacesTraits> raceTraits;
    private List<Gear> gear;
    private List<Classes> classes;
    private List<ClassLevels> classLevels;
    private List<Spells> spells;



    int getCharId() {
        return charId;
    }

    void setCharId(int charId) {
        this.charId = charId;
    }

    public String getRace() {
        return race;
    }

    void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    void setLevel(int level) {
        this.level = level;
    }

    public String getAlignment() {
        return alignment;
    }

    void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getDeity() {
        return deity;
    }

    void setDeity(String deity) {
        this.deity = deity;
    }

    public int getHeight() {
        return height;
    }

    void setHeight(int height) {
        this.height = height;
    }

    public String getHeightUnit() {
        return heightUnit;
    }

    void setHeightUnit(String heightUnit) {
        this.heightUnit = heightUnit;
    }

    public int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public List<RacesTraits> getRacetraits() {
        return raceTraits;
    }

    void setRaceTraits(List<RacesTraits> raceTraits) {
        this.raceTraits = raceTraits;
    }

    public List<Gear> getGear() {
        return gear;
    }

    public void setGear(List<Gear> gear) {
        this.gear = gear;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }

    public List<ClassLevels> getClassLevels() {
        return classLevels;
    }

    public void setClassLevels(List<ClassLevels> classLevels) {
        this.classLevels = classLevels;
    }

    public List<Spells> getSpells() {
        return spells;
    }

    public void setSpells(List<Spells> spells) {
        this.spells = spells;
    }
}
