package de.isa.models;

import de.isa.enums.Manufacturer;
import de.isa.enums.Type;
import de.isa.enums.Wood;


public class Guitar {
	private String serialNumber;
	private Double price;
	private GuitarData guitarData;
	
	public Guitar(
			String serialNumber,
			Double price,
			Manufacturer manufacturer,
			String model,
			Type type,
			Wood groundWood,
			Wood coverWood) {
			
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarData = new GuitarData(manufacturer, model, type, groundWood, coverWood);
	}
	
	public String getSerialNumber() {
		return this.serialNumber;
	}
	
	public Double getPrice() {
		return this.price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public GuitarData getGuitarData() {
		return this.guitarData;
	}

}