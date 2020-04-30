/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational;

/**
 *
 * @author Andres Gonzalez
 */
public class Queue<V> {

    private Node front;
    private Node rear;
    private int maxItems, totalItems;

    public Queue(int size) {
        maxItems = size;
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
