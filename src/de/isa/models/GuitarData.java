package de.isa.models;

import de.isa.enums.Type;
import de.isa.enums.Wood;
import de.isa.enums.Manufacturer;

public class GuitarData {
    private Manufacturer manufacturer;
    private String modell;
    private Type type;
    private Wood groundWood;
    private Wood coverWood;
    private Integer amountOfStrings;

    public GuitarData(Manufacturer manufacturer, String modell, Type type, Wood groundWood, Wood coverWood, Integer amountOfStrings) {
        this.manufacturer = manufacturer;
        this.modell = modell;
        this.type = type;
        this.groundWood = groundWood;
        this.coverWood = coverWood;
        this.amountOfStrings = amountOfStrings;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return modell;
    }

    public Type getType() {
        return type;
    }

    public Wood getGroundWood() {
        return groundWood;
    }

    public Wood getCoverWood() {
        return coverWood;
    }

    public Integer getAmountOfStrings() {
        return amountOfStrings;
    }

    public Boolean equalsGuitarData(GuitarData guitarData) {
        String model = guitarData.getModel().toLowerCase();

        if (this.getCoverWood() == guitarData.getCoverWood()
                && this.getGroundWood() == guitarData.getGroundWood()
                && this.getType() == guitarData.getType()
                && this.getManufacturer() == guitarData.getManufacturer()
                && this.getAmountOfStrings() == guitarData.getAmountOfStrings()
                && ((!model.equals("")) && (model.equals(this.getModel().toLowerCase())))
                ) {
            return true;
        } else {
            return false;
        }
    }
}