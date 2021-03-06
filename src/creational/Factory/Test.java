/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Factory;



/**
 * @author Andrés Antonio González Orozco B83477  
 * @author José David Camacho Vargas B91484
 * 
 * Clase para realizar la prueba del patrón Factory method en las clases Queue,
 * Stack y SortedList
 */
public class Test {
    public static void main(String args[]) {
        
        // Prueba cola
        
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
        } catch (CollectionException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        // Prueba pila
        
        factory = new StackFactory();
        NewCollection stack = factory.createCollection();
        try {
            stack.add(1);
            stack.add(2);
            stack.add(3);
            stack.add(4);
            stack.add(5);
            System.out.println(stack.showCollection());
            stack.delete();
            System.out.println(stack.showCollection());
            stack.delete(3);
            System.out.println(stack.showCollection());
            stack.delete(2);
            System.out.println(stack.showCollection());
        } catch (CollectionException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        // Prueba lista ordenada
        
        factory = new SortedListFactory();
        NewCollection sortedList = factory.createCollection();
        try {
            sortedList.add(4);
            sortedList.add(3);
            sortedList.add(5);
            sortedList.add(1);
            sortedList.add(2);
            System.out.println(sortedList.showCollection());
            sortedList.delete(3);
            System.out.println(sortedList.showCollection());
            sortedList.delete(5);
            System.out.println(sortedList.showCollection());
        } catch (CollectionException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
