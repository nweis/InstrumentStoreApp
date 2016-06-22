package de.isa.models;

public class Guitar {
	private String serialNumber;
	private Double price;
	private GuitarData guitarData;
	
	public Guitar(
			String serialNumber,
			Double price,
			GuitarData guitarData) {
			
		this.serialNumber = serialNumber;
		this.price = price;
		this.guitarData = guitarData;
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