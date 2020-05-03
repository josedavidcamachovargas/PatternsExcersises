/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Factory;

/**
 *
 * @author Andrés Antonio González Orozco B83477  
 * @author José David Camacho Vargas B91484
 * 
 * Clase para definir un método estándar para crear un objeto, aparte de un
 * constructor, pero la decisión de qué tipo de objeto crear se deja a las subclases.
 */
public interface NewCollectionFactoryInterface {
    
    NewCollection createCollection();
}
