package de.isa.enums;

public enum Wood {
	INDIAN_JACARANDA, MAHOGANY, MAPLE, CEDAR, ALDER;
	
	public String toString() {
		switch(this) {
			case INDIAN_JACARANDA: return "Indian jacaranda";
			case MAHOGANY: return "Mahogany";
			case MAPLE: return "Maple";
			case CEDAR: return "Cedar";
			case ALDER: return "Alder";
			default: return null;
		}
	}
}