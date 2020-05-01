/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Builder;

/**
 *
 * @author José David
 */
public class BuilderException extends Exception {
    
    private static final String defaultMessage = "El proyecto no puede ser creado debido a problemas en sus datos:\n\n";
    
    public BuilderException(String message) {
        super(defaultMessage + message);
    }
    
}
