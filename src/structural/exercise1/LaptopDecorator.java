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
 * Clase para proporcionar una manera felxible de agregar la
 * funcionalidad de un componente sin cambiar el original o su función.
 */
public abstract class LaptopDecorator implements Sellable {
    
    private final Sellable sellable;

    public LaptopDecorator(Sellable sellable) {
        this.sellable = sellable;
    }

    public Sellable getSellable() {
        return sellable;
    }
}
