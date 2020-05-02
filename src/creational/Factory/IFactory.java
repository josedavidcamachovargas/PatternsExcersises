/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Factory;

/**
 *
 * @author Andres Gonzalez
 * @param 
 */
public interface IFactory<V> {
    
    public V add(V value)throws QueueException, StackException;
    public V delete()throws QueueException, StackException;
    public void show();
}
