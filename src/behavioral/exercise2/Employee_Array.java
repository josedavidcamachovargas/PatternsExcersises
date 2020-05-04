/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.exercise2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Andrés Antonio González Orozco B83477  
 * @author José David Camacho Vargas B91484
 * Esta clase se encarga de crear un ArrayList de tipo ClsException, además se 
 * implementan metodos como el de agregar, imprimir, ordenar por cedula, entre otros.
 */
public class Employee_Array implements InterfaceSort {

    private ArrayList<ClsEmployee> list;

    public Employee_Array() {
        list = new ArrayList<>();
    }

    public Employee_Array(ArrayList<ClsEmployee> list) {
        this.list = list;
    }

    public ArrayList<ClsEmployee> getList() {
        return list;
    }

    public void setList(ArrayList<ClsEmployee> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Lista de empleados: " + list.toString();
    }
    
    public void add(ClsEmployee employee) throws EmployeeException {
        if (list.isEmpty()) {
            list.add(employee);
        } else if (idValidation(employee.getId()) == true) {
            list.add(employee);
        }
    }
    
    @Override
    public void ascendingId(){
        ClsEmployee aux;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).getId() > list.get(j+1).getId()) {
                    aux = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, aux);
                }
            }
        }
    }

    @Override
    public void ascendingSurename() {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).getSurename().compareTo(list.get(j + 1).getSurename()) > 0) {//Metodo burbuja
                    compareName(j);
                } else if (list.get(j).getSurename().compareTo(list.get(j + 1).getSurename()) == 0) {
                    if (list.get(j).getSecondSurename().compareTo(list.get(j + 1).getSecondSurename()) > 0) {
                        compareName(j);
                    } else if (list.get(j).getSecondSurename().compareTo(list.get(j + 1).getSecondSurename()) == 0) {
                        if (list.get(j).getFirstName().compareTo(list.get(j + 1).getFirstName()) > 0) {
                            compareName(j);
                        } else if (list.get(j).getFirstName().compareTo(list.get(j + 1).getFirstName()) == 0) {
                            if (list.get(j).getSecondName().compareTo(list.get(j + 1).getSecondName()) > 0) {
                                compareName(j);
                            }
                        }
                    }
                }
            }
        }
    }
    
     /*Este metodo se encarga de la operacion que se haria en ascendingSurename
    en la cual se guarda un empleado llamado aux, el cual va a guardar un empleado
    de una posicion especifica, luego al empleado el cual se compara se le hace un
    set con un indice y con el empleado siguiente, y por ultimo se hace el mismo set
    pero esta vez guardando la posicion que teniamos del aux*/
    private void compareName(int position){
        ClsEmployee aux;
        aux = list.get(position);
        list.set(position, list.get(position+1));
        list.set(position+1, aux);
    }
    
    
    @Override
    public void descendentSalary(){
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).getSalary() < list.get(j+1).getSalary()) {
                    compareName(j);
                }
            }
        }
    }
    
    /*Este metodo se encarga de validar si una cedula agregada no es igual a la de
    otro trabajador, en el caso de que lo sea se lanza una excepcion en la cual 
    indica el error*/
    private boolean idValidation(int id) throws EmployeeException {
        Iterator<ClsEmployee> i = list.iterator();
        while (i.hasNext()) {
            if (i.next().getId() == id) {
                throw new EmployeeException("No puede haber 2 números de cedula iguales");
            }
        }
        return true;
    }
}
