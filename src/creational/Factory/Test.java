/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Factory;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres Gonzalez
 */
public class Test {
    public static void main(String args[]) {
        NewCollectionFactoryInterface factory = new QueueFactory();
        NewCollection queue = factory.createCollection();
        try {
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            System.out.println(queue.showCollection());
            queue.delete();
            System.out.println(queue.showCollection());
            queue.delete(4);
            System.out.println(queue.showCollection());
            queue.delete(3);
            System.out.println(queue.showCollection());
        } catch (QueueException ex) {
            System.out.println(ex.getMessage());
        } catch (StackException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
