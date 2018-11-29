package com.appfinder.components.gear;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Gear {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gearId;
    private String name;
    private int typeId;
    private int modifier;
    private int abilityId;
    private String description;
    private int currencyId;
    private int weight;
    private String weightUnit;
    private String dmgSmall;
    private String dmgMiddle;
    private String critical;
    private String itemRange;
    private String special;

    public int getGearId() {
        return gearId;
    }

    public void setGearId(int gearId) {
        this.gearId = gearId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int type) {
        this.typeId = type;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public int getAbilityId() {
        return abilityId;
    }

    public void setAbilityId(int abilityId) {
        this.abilityId = abilityId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getDmgSmall() {
        return dmgSmall;
    }

    public void setDmgSmall(String dmgSmall) {
        this.dmgSmall = dmgSmall;
    }

    public String getDmgMiddle() {
        return dmgMiddle;
    }

    public void setDmgMiddle(String dmgMiddle) {
        this.dmgMiddle = dmgMiddle;
    }

    public String getCritical() {
        return critical;
    }

    public void setCritical(String critical) {
        this.critical = critical;
    }

    public String getItemRange() {
        return itemRange;
    }

    public void setItemRange(String itemRange) {
        this.itemRange = itemRange;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }
}
