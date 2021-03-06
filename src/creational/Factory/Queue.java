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
public class Queue<V> extends NewCollection<V>{
    
    private Node front = getFirst();
    private Node rear = getLast();

    public Queue() {
        super();
    }

    public Queue(int size) {
        super(size);
    }
    
    // enqueue method 
    @Override
    public boolean add(V value) throws CollectionException {
        Node newNode = new Node();
        newNode.setValue(value);
        if (getMaxItems() > 0 && getTotalItems() == getMaxItems()) {
            throw new CollectionException("La cola está llena");
        } else {
            if (front == null) {
                front = rear = newNode;
            } else {
                rear.setNext(newNode);
                rear = newNode;
            }
            setTotalItems(getTotalItems() + 1);
        }

        return true;
    }
    
    // dequeue method
    @Override
    public V delete() throws CollectionException{
        if (front == null) {
            throw new CollectionException("La cola está vacía");
        }
        V dato = (V)front.getValue();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        setTotalItems(getTotalItems() - 1);
        
        return dato;
    }
    
    @Override
    public boolean delete(V value) throws CollectionException{
        V temp = null;
        if (front == null) {
            throw new CollectionException("La cola está vacía");
        }
        if (front == rear) {
            front = rear = null;
            setTotalItems(getTotalItems() - 1);
        } else {
            
            if (front.getValue().equals(value)) {
                delete();
            } else {
                for (Node current = front; current.getNext() != null; current = current.getNext()) {
                    if (current.getNext().getValue().equals(value)) {
                        temp = (V) current.getNext().getValue();
                        if (current.getNext() == rear) {
                            current.setNext(null);
                            rear = current;
                        } else {
                            Node change = current.getNext().getNext();
                            current.getNext().setNext(null);
                            current.setNext(change);
                        }
                        setTotalItems(getTotalItems() - 1);
                        break;
                    }
                }
            }

        }
        return temp != null;
        
    }
    
    @Override
    public String showCollection(){
        Node aux = front;
        String txt = "Lista de elementos de la cola:\n";
        for(int i = 0; i < getTotalItems(); i++){
            txt += aux.getValue() + "\n";
            aux = aux.getNext(); 
        }
        return txt;
    }

}
