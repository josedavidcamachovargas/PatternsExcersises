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
 * Esta clase se encarga de crear una pila basica con sus respectivos metodos
 * apilar, desapilar
 */
public class Stack<V> extends NewCollection<V>{
    private Node top;
    
    public Stack() {
        super();
    }
    
    public Stack(int size) {
        super(size);
    }


    // pop method
    @Override
    public V delete() throws StackException {
        V value;
        if (top == null) {
            throw new StackException("La pila esta vacia");
        } else {
            value = (V) top.getValue();
            top = top.getNext();
            setTotalItems(getTotalItems() - 1);
        }
        return value;
    }

    @Override
    public V delete(V value) throws QueueException, StackException {
        V temp = null;
        if (top == null) {
            throw new StackException("La pila esta vacia");
        } else {
            if (top.getValue().equals(value)) {
                delete();
            } else {
                for (Node current = top; current.getNext() != null; current = current.getNext()) {
                    if (current.getNext().getValue().equals(value)) {
                        temp = (V) current.getNext().getValue();
                        if (current.getNext().getNext() == null) {
                            current.setNext(null);
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
        return temp;
    }

    // push method
    @Override
    public V add(V value) throws StackException{
        if(getMaxItems() > 0 && getTotalItems() == getMaxItems()){
            throw new StackException("La pila esta llena");
            
        }else {
            Node newNode = new Node();
            newNode.setValue(value);
            
            if(top == null){
                top = newNode;
                
            }else{
                newNode.setNext(top);
                top = newNode;
            }
            setTotalItems(getTotalItems() + 1);
        }
        return value;
    }
    
    @Override
    public String showCollection(){
        Node aux = top;
        String txt = "Lista de elementos de la pila:\n";
        for(int i = 0; i < getTotalItems(); i++){
            txt += aux.getValue() + "\n";
            aux = aux.getNext(); 
        }
        return txt;
    }



}
