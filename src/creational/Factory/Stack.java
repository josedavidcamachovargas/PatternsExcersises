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
    
    //Si tamaño > 0 -> pila es finita 
    //Si tamaño <= 0 -> pila es infinita
    public Stack(int tamaño) {
        maxElementos = tamaño;
    }
    
    public int size() {
        return numElementos;
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

    public int search(int value) throws StackException {
        int contador = 0;
        if (top == null) {
            throw new StackException("La lista esta vacia");
        } else {
            Node actual = top;
            while (actual != null) {
                if (actual.getValue().equals(value)) { 
                    return contador;
                }
                    contador++;
                    actual = actual.getNext();
            }
        }
        return -1;
    }
}
