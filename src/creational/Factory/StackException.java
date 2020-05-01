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
 * Esta clase se encarga de manejar las exepciones de Stack, heredando de la 
 * clase padre Exception y utilizando en el metodo constructor el super y 
 * recibiendo un mensaje el cual sera el error que esta maneje.
 */
public class StackException extends Exception{

    public StackException(String message) {
        super(message);
    }
}
