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
 * Esta clase se encarga de crear una excepcion de tipo collection la 
 * cual va a ser utilizada en las clases 
 */
public class CollectionException extends Exception {
    public CollectionException(String message) {
        super(message);
    }
}
