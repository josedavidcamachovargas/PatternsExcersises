/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Factory;

import creational.Singleton.QueueException;

/**
 *
 * @author Andrés Antonio González Orozco B83477  
 * @author José David Camacho Vargas B91484
 * Esta clase se encarga de crear una cola basica con sus respectivos metodos
 * de encolar, desencolar, el metodo peek y tambien isEmpty()
 */
public class Queue<V> implements IFactory{
    
    private Node front;
    private Node rear;
    private int maxItems, totalItems;
    private static Queue instance;

    public static Queue getInstance(){
        if(instance == null ){
            instance = new Queue();
        }
        return instance;
    }
    
    //Enqueue method 
    @Override
    public V add(V value) throws QueueException {
        Node n = new Node();
        n.setValue(value);
        if (maxItems > 0 && totalItems == maxItems) {
            throw new QueueException("La cola esta llena");
        } else if (front == null) {
            front = rear = n;
        } else {
            totalItems++;
        }
        return (V) rear.getValue();
    }

    //Dequeue method
    public V delete(V value) throws QueueException {
        if (front == null) {
            throw new QueueException("La cola está vacía");
        }
        V newNum = (V) front.getValue();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        totalItems++;
        return newNum;
    }
    
    //peek method
    public V peek() throws QueueException{
        if(front == null){
            throw new QueueException("La cola esta vacía");
        }
        return (V) front.getValue();
    }
    
    //isEmpty method
    public boolean isEmpty(){
        boolean empty;
        empty = front == null;
        return empty;
    }
}
