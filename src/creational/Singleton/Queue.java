/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Singleton;

/**
 *
 * @author Andrés Antonio González Orozco B83477  
 * @author José David Camacho Vargas B91484
 * Esta clase se encarga de crear una cola basica con sus respectivos metodos
 * de encoolar, desencolar, el metodo peek y tambien isEmpty()
 *
 * El propósito es tener solo una instancia de esta clase en el sistema,
 * al tiempo que permite que otras clases tengan acceso a esta única instancia.
 * El patrón únicamente requiere de la programación de la clase Queue.
 */
public class Queue<V> {

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
    public V enqueue(V value) throws QueueException {
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
    public V dequeue(V value) throws QueueException {
        if (front == null) {
            throw new QueueException("La cola esta vacía");
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
