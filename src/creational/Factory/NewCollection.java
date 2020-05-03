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
 * Clase para defenir una colección genérica estándar, adaptable luego para su
 * uso en tipos de colecciones específicas.
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
    
    public abstract boolean add(V element) throws CollectionException;
    
    // Este delete borra el elemento de la lista correspondiente, el frente
    // en caso de cola, el tope en caso de la pila.
    public abstract V delete() throws CollectionException;
    
    // Este delete borra el elemento especificado por el usuario.
    public abstract boolean delete(V element) throws CollectionException;
    public abstract String showCollection();
}
