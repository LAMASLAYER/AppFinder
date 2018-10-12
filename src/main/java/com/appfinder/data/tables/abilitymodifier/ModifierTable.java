package com.appfinder.data.tables.abilitymodifier;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ModifierTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int modifierTableId;
    private int matrixValue;

    public int getModifierTableId() {
        return modifierTableId;
    }

    public void setModifierTableId(int modifierTableId) {
        this.modifierTableId = modifierTableId;
    }

    public int getMatrixValue() {
        return matrixValue;
    }

    public void setMatrixValue(int matrixValue) {
        this.matrixValue = matrixValue;
    }
}
