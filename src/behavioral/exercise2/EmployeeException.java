/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.exercise2;

/**
 *
 * @author Andrés Antonio González Orozco B83477  
 * @author José David Camacho Vargas B91484
 * Esta clase se encarga de crear una excepcion de tipo collection la 
 * cual va a ser utilizada en las clases 
 */
public class EmployeeException extends Exception{

    public EmployeeException(String message) {
        super(message);
    }
}