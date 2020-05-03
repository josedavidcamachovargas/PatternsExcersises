/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Builder;

/**
 *
 * @author Andrés Antonio Gonzalez Orozco B83477
 * @author José David Camacho Vargas B91484
 * 
 * Esta clase maneja los mensajes de excepción para los posibles problemas
 * dados en el patrón builder.
 */
public class BuilderException extends Exception {
    
    private static final String defaultMessage = "El proyecto no puede ser creado debido a problemas en sus datos:\n\n";
    
    public BuilderException(String message) {
        super(defaultMessage + message);
    }
    
}
