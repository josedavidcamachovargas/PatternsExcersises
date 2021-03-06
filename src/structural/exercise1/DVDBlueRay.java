/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.exercise1;

/**
 *
 * @author Andrés Antonio Gonzalez Orozco B83477
 * @author José David Camacho Vargas B91484
 * 
 * Esta clase crea un objeto que se refiere al periférico de una laptop.
 */
public class DVDBlueRay extends LaptopDecorator {
    private final int PRICE = 12000;
    private final String BASE_DESCRIPTION = "Lector DVD - BlueRay";
    private final String DETAILED_DESCRIPTION = "HP 104 DVD";

    public DVDBlueRay(Sellable sellable) {
        super(sellable);
    }

    @Override
    public String getDescription() {
        return getSellable().getDescription() + ", " + BASE_DESCRIPTION + " - " + DETAILED_DESCRIPTION;
    }

    @Override
    public double getPrice() {
        return getSellable().getPrice() + PRICE;
    }
    
    
}
