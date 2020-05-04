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
 * Clase que realiza la prueba de los distintos métodos para la aplicación del
 * patrón Decorator.
 */
public class Test {
    public static void main(String[] args) {
        Sellable laptop1 = new Laptop(100000, "HP - 207");
        laptop1 = new DVDBlueRay(laptop1);
        laptop1 = new FingerprintReader(laptop1);

        Sellable laptop2 = new Laptop(180000, "ASUS H - 110");
        laptop2 = new DVDBlueRay(laptop2);
        laptop2 = new FingerprintReader(laptop2);
        laptop2 = new SD_Reader(laptop2);
        laptop2 = new WebCam(laptop2);

        System.out.println("Laptop 1:\n" + laptop1.getDescription() + "\nPrecio: " + laptop1.getPrice() + "\n\n");
        System.out.println("Laptop 2:\n" + laptop2.getDescription() + "\nPrecio: " + laptop2.getPrice() + "\n\n");
    }
}
