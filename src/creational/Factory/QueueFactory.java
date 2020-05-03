/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Factory;

/**
 * @author Andrés Antonio González Orozco B83477  
 * @author José David Camacho Vargas B91484
 */
public class QueueFactory implements NewCollectionFactoryInterface {

    @Override
    public NewCollection createCollection() {
        return new Queue();
    }
    
}
