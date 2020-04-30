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
public class Test {
    public static void main(String [] args) throws QueueException{
        
        Queue queue = Queue.getInstance();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}
