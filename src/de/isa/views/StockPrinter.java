package de.isa.views;

import de.isa.models.Guitar;
import de.isa.models.Stock;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by nweis on 22.06.2016.
 */
public class StockPrinter {


    public static void printStock(Stock testStock) {
        printGuitarList(testStock.getGuitars());
    }

    public static void printGuitarList(LinkedList<Guitar> guitarLinkedList) {

        for (Iterator i = guitarLinkedList.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();

            printGuitar(guitar);
        }
    }

    public static void printGuitar(Guitar guitar) {
        System.out.println("Serialnumber: " + guitar.getSerialNumber());
        System.out.println("Price: " + guitar.getPrice());
        System.out.println("Manufacturer: " + guitar.getGuitarData().getManufacturer().toString());
        System.out.println("Model: " + guitar.getGuitarData().getModell());
        System.out.println("Type: " + guitar.getGuitarData().getType());
        System.out.println("Ground wood: " + guitar.getGuitarData().getGroundWood());
        System.out.println("Cover wood: " + guitar.getGuitarData().getCoverWood());
        System.out.println("---");
    }

}
