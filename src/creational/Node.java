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
public class Node<V> {
    private int num;
    private Node next;

    public Node() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public V getNext() {
        return next;
    }

    public void setNext(V next) {
        this.next = next;
    }
    
}
