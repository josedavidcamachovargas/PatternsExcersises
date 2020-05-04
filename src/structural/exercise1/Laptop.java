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
 * Esta clase crea un objeto Laptop al cual se le pueden agregar posteriormente
 * distintos componentes, lo que cambiará su descripción y precio.
 */
public class Laptop implements Sellable {
    private double price;
    private String description;
    
    public Laptop() {
    }

    public Laptop(double price, String description) {
        this.price = price;
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
