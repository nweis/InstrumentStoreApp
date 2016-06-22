package de.isa;

import de.isa.enums.Manufacturer;
import de.isa.enums.Type;
import de.isa.enums.Wood;
import de.isa.models.Stock;
import de.isa.models.Guitar;
import de.isa.models.GuitarData;
import de.isa.views.StockPrinter;
import java.util.LinkedList;


public class MainIsa {

    public static void main(String[] args) {
        Stock testStock = fillStock();

        // Print entire stock
//        StockPrinter.printStock(testStock);

        // Test getGuitar method
        //Guitar singleTestGuitar = testStock.getGuitar("Serial 1");
//        StockPrinter.printGuitar(singleTestGuitar);

        // Test search method om stock
        GuitarData guitarTheCustomerLikes = new GuitarData(Manufacturer.PRS, "Model", Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
        LinkedList<Guitar> results = testStock.search(guitarTheCustomerLikes);
        StockPrinter.printGuitarList(results);
    }

    private static Stock fillStock() {

        Stock stock = new Stock();

        // Test guitar1
        String serialNumber1 = "Serial 1";
        Double price1 = 1.1;
        String model1 = "Model";

        stock.addGuitar(serialNumber1, price1, Manufacturer.PRS, model1, Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);

        // Test guitar2
        String serialNumber2 = "Serial 2";
        Double price2 = 2.2;
        String model2 = "Model";

        stock.addGuitar(serialNumber2, price2, Manufacturer.PRS, model2, Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);

        // Test guitar3
        String serialNumber3 = "Serial 3";
        Double price3 = 3.3;
        String model3 = "Model 3";

        stock.addGuitar(serialNumber3, price3, Manufacturer.GIBSON, model3, Type.ELECTRIC, Wood.INDIAN_JACARANDA, Wood.INDIAN_JACARANDA, 12);

        // Test guitar4
        String serialNumber4 = "Serial 4";
        Double price4 = 4.4;
        String model4 = "Model 4";

        stock.addGuitar(serialNumber4, price4, Manufacturer.MARTIN, model4, Type.ACOUSTIC, Wood.MAHOGANY, Wood.MAHOGANY, 12);

        return stock;
    }

}
