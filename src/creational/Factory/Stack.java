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
    private int maxItems;
    private int totalItems;
    
    public Stack() {
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public int getMaxItems() {
        return maxItems;
    }

    public void setItems(int maxItems) {
        this.maxItems = maxItems;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    //Desapilar pop
    @Override
    public V delete() throws StackException {
        V value;
        if (top == null) {
            throw new StackException("La pila esta vacia");
        } else {
            value = (V) top.getValue();
            top = top.getNext();
        }
        return value;
    }

    @Override
    public V delete(V element) throws QueueException, StackException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Apilar push
    @Override
    public V add(V value) throws StackException{
        if(maxItems > 0 && totalItems == maxItems){
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
            totalItems++;
        }
        return value;
    }
    
    @Override
    public String showCollection(){
        Node aux = top;
        String txt = "Lista de elementos de la cola:\n";
        for(int i = 0; i < getTotalItems(); i++){
            txt += aux.getValue() + "\n";
            aux = aux.getNext(); 
        }
        return txt;
    }



}
