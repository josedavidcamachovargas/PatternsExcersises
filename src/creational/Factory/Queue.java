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
 * Esta clase se encarga de crear una cola basica con sus respectivos metodos
 * de encolar, desencolar, el metodo peek y tambien isEmpty()
 */
public class Queue<V> implements IFactory<V>{
    
    private Node front;
    private Node rear;
    private int maxItems, totalItems;
    
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

    @Override
    public V delete() throws QueueException{
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

}
