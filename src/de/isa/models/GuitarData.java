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

    public GuitarData(Manufacturer manufacturer, String modell, Type type, Wood groundWood, Wood coverWood) {
        this.manufacturer = manufacturer;
        this.modell = modell;
        this.type = type;
        this.groundWood = groundWood;
        this.coverWood = coverWood;
    }

    public Manufacturer getManufacturer() {
        return this.manufacturer;
    }

    public String getModell() {
        return this.modell;
    }

    public Type getType() {
        return this.type;
    }

    public Wood getGroundWood() {
        return this.groundWood;
    }

    public Wood getCoverWood() {
        return this.coverWood;
    }
}