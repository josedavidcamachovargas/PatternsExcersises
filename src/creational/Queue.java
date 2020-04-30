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
public class Queue {

    private Node front;
    private Node rear;
    private int maxItems, totalItems;

    public Queue(int size) {
        maxItems = size;
    }

    //Enqueue method
    public int enqueue(int num) throws QueueException {
        Node n = new Node();
        n.setNum(num);
        if (maxItems > 0 && totalItems == maxItems) {
            throw new QueueException("La cola esta llena");
        } else if (front == null) {
            front = rear = n;
        } else {
            totalItems++;
        }
        return rear.getNum();
    }

    //Dequeue method
    public int dequeue(int num) throws QueueException {
        if (front == null) {
            throw new QueueException("La cola esta vacía");
        }
        int newNum;
        newNum = front.getNum();
        front = (Node) front.getNext();
        if (front == null) {
            rear = null;
        }
        totalItems++;
        return newNum;
    }
    
    //peek method
    public int peek()throws QueueException{
        if(front == null){
            throw new QueueException("La cola esta vacía");
        }
        return front.getNum();
    }
    
    //isEmpty method
    public boolean isEmpty(){
        boolean empty;
        empty = front == null;
        return empty;
    }

}
