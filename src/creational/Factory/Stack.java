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
public class Stack<V> implements IFactory<V>{
    private Node top;
    private int maxElementos;
    private int numElementos;
    
    public Stack() {
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public int getMaxElementos() {
        return maxElementos;
    }

    public void setMaxElementos(int maxElementos) {
        this.maxElementos = maxElementos;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
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

    //Apilar push
    @Override
    public V add(V value) throws StackException{
        if(maxElementos > 0 && numElementos == maxElementos){
            throw new StackException("La pila esta llena");
            
        }else {
            Node nuevo = new Node();
            nuevo.setValue(value);
            
            if(top == null){
                top = nuevo;
                
            }else{
                nuevo.setNext(top);
                top = nuevo;
            }
            numElementos++;
        }
        return value;
    }
    
    @Override
    public void show(){
        Node aux = new Node();
        aux = top;
        System.out.println("Lista de elementos de la pila.");
        for(int i = 0; i <maxElementos; i++){
            System.out.println(aux.getValue() + " - ");
            aux = aux.getNext();
            
        }
    }

}
