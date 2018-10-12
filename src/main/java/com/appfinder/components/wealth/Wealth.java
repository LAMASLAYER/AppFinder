package com.appfinder.components.wealth;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wealth {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int wealthId;
    private int goldAmnt;
    private int silverAmnt;
    private int copperAmnt;


    public int getWealthId() {
        return wealthId;
    }

    public void setWealthId(int wealthId) {
        this.wealthId = wealthId;
    }

    public int getGoldAmnt() {
        return goldAmnt;
    }

    public void setGoldAmnt(int goldAmnt) {
        this.goldAmnt = goldAmnt;
    }

    public int getSilverAmnt() {
        return silverAmnt;
    }

    public void setSilverAmnt(int silverAmnt) {
        this.silverAmnt = silverAmnt;
    }

    public int getCopperAmnt() {
        return copperAmnt;
    }

    public void setCopperAmnt(int copperAmnt) {
        this.copperAmnt = copperAmnt;
    }
}
