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
 * Esta clase se encarga de crear una lista de elementos en la cual cada
 * vez que se agrega un elemento, este es ordenado de acuerdo a los que ya se
 * tienen dentro.
 */
public class SortedList<V> extends NewCollection<V> {

    public SortedList() {
        super();
    }
    
    public SortedList(int size) {
        super(size);
    }

    // add element method
    @Override
    public boolean add(V value) throws CollectionException {
        Node node = new Node();
        node.setValue(value);
        if (getMaxItems() > 0 && getTotalItems() == getMaxItems()) {
            throw new CollectionException("La lista está llena");
        } else {
            if (getTotalItems() == 0) {
                setFirst(node);
                setLast(node);
            } else {
                Node current = getFirst();
                for (int i = 0; i < getTotalItems(); i++) {
                    if (current.compareTo(node) > 0) {
                        node.setNext(current);
                        setFirst(node);
                        break;
                    } else if (current.compareTo(node) <= 0) {
                        if (current.getNext() == null) {
                            current.setNext(node);
                            setLast(node);
                            break;
                        } else if (current.getNext().compareTo(node) > 0) {
                            node.setNext(current.getNext());
                            current.setNext(node);
                            break;
                        }
                    }
                    current = current.getNext();
                }
            }
            setTotalItems(getTotalItems() + 1);
            return true;
        }
    }

    // Como esta clase no es pila y cola, no supimos exactamente que elemento
    // eliminar en caso de que no se especificara, por lo que solo implementamos
    // el delete que recibe un parámetro por el usuario.
    
    @Override
    public V delete() throws CollectionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(V value) throws CollectionException {
        V temp = null;
        if (getFirst() == null) {
            throw new CollectionException("La cola está vacía");
        }
        if (getFirst() == getLast()) {
            setFirst(null);
            setLast(null);
            setTotalItems(getTotalItems() - 1);
        } else {
            if (getFirst().getValue().equals(value)) {
                Node node = getFirst().getNext();
                getFirst().setNext(null);
                setFirst(node);
                setTotalItems(getTotalItems() - 1);
            } else {
                for (Node current = getFirst(); current.getNext() != null; current = current.getNext()) {
                    if (current.getNext().getValue().equals(value)) {
                        temp = (V) current.getNext().getValue();
                        if (current.getNext() == getLast()) {
                            current.setNext(null);
                            setLast(current);
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
    public String showCollection() {
        Node aux = getFirst();
        String txt = "Lista de elementos de la lista ordenada:\n";
        for(int i = 0; i < getTotalItems(); i++){
            txt += aux.getValue() + "\n";
            aux = aux.getNext(); 
        }
        return txt;
    }
    
    
    
}
