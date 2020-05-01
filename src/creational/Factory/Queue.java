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
 * de encoolar, desencolar, el metodo peek y tambien isEmpty()
 */
public class Queue<V>{
    
    private creational.Singleton.Node front;
    private creational.Singleton.Node rear;
    private int maxItems, totalItems;
    private static creational.Singleton.Queue instance;

    public static creational.Singleton.Queue getInstance(){
        if(instance == null ){
            instance = new creational.Singleton.Queue();
        }
        return instance;
    }
    
    //Enqueue method
    public V enqueue(V value) throws QueueException {
        creational.Singleton.Node n = new creational.Singleton.Node();
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
    public V dequeue(V value) throws QueueException {
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
