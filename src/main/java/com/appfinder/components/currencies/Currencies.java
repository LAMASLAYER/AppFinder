package com.appfinder.components.currencies;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Currencies {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int currencyId;
    private String name;
    private String shortNm;
    private String description;


    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortNm() {
        return shortNm;
    }

    public void setShortNm(String shortNm) {
        this.shortNm = shortNm;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
