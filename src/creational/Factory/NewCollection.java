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
 * 
 */
public abstract class NewCollection<V> {
    private Node first, last;
    private int maxItems, totalItems;

    public NewCollection() {
        maxItems = 0;
        totalItems = 0;
    }

    public NewCollection(int size) {
        maxItems = size;
        totalItems = 0;
    }
    
    
    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getMaxItems() {
        return maxItems;
    }

    public void setMaxItems(int maxItems) {
        this.maxItems = maxItems;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        
        this.totalItems = totalItems;
    }
    
    public abstract V add(V element) throws QueueException, StackException;
    // Este delete borra el elemento de la lista correspondiente, el frente
    // en caso de cola, el tope en caso de la pila.
    public abstract V delete() throws QueueException, StackException;
    // Este delete borra el elemento especificado por el usuario.
    public abstract V delete(V element) throws QueueException, StackException;
    public abstract String showCollection();
}
