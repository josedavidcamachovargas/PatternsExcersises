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
public class Test {
    public static void main(String args[]) throws QueueException, StackException {
        try {
        
        IFactory qFactory = new Queue();
        qFactory.add(8);
        qFactory.add(7);
        qFactory.add(6);
        qFactory.show();
        
        IFactory qFactory1 = new Stack();
        qFactory1.add(6);
        qFactory1.add(7);
        qFactory1.add(8);
        qFactory1.show();
        
        } catch (QueueException | StackException e) {
            System.err.println(e.getMessage());
        }
    }
}
