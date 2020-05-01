/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Factory;

/**
 *
 * @author Andres Gonzalez
 */
public interface IFactory<V> {
    
    public V add(V value);
    public V delete() throws StackException, QueueException;
}
