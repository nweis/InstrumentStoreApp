package de.isa.models;

import java.util.*;

import de.isa.enums.Manufacturer;
import de.isa.enums.Type;
import de.isa.enums.Wood;
import sun.awt.image.ImageWatched;

public class Stock {
	private LinkedList<Guitar> guitars;

	public Stock() {
		this.guitars = new LinkedList<>();
	}

	public void addGuitar(
			String serialNumber,
			Double price,
			Manufacturer manufacturer,
			String model,
			Type type,
			Wood groundWood,
			Wood coverWood) {

		Guitar guitarToAdd = new Guitar(serialNumber, price, manufacturer, model, type, groundWood, coverWood);
		this.guitars.add(guitarToAdd);
	}

	public LinkedList<Guitar> getGuitars() {
		return this.guitars;
	}
	
	public Guitar getGuitar(String serialNumber) {
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitarToCheck = (Guitar)i.next();

			if(guitarToCheck.getSerialNumber() == serialNumber)
				return guitarToCheck;
		}

		return null;
	}
	
	public LinkedList search(GuitarData searchData) {
		LinkedList<Guitar> foundGuitars = new LinkedList<>();

		for(Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar currentGuitarToCheck = (Guitar)i.next();
			if(currentGuitarToCheck.getGuitarData().getCoverWood() == searchData.getCoverWood())
				continue;
			if(currentGuitarToCheck.getGuitarData().getGroundWood() == searchData.getGroundWood())
				continue;
			foundGuitars.add(currentGuitarToCheck);
		}

		return foundGuitars;
	}
}