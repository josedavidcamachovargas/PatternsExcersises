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
public class Employee_Array {

    private ArrayList<Employee> list;

    public Employee_Array() {
        list = new ArrayList<>();
    }

    public Employee_Array(ArrayList<Employee> list) {
        this.list = list;
    }

    public ArrayList<Employee> getList() {
        return list;
    }

    public void setList(ArrayList<Employee> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Lista de empleados: " + list.toString();
    }
    
    public void add(Employee employee) throws EmployeeException {
        if (list.isEmpty()) {
            list.add(employee);
        } else if (idValidation(employee.getId()) == true) {
            list.add(employee);
        }
    }
    
    
    /*Este metodo se encarga de validar si una cedula agregada no es igual a la de
    otro trabajador, en el caso de que lo sea se lanza una excepcion en la cual 
    indica el error*/
    private boolean idValidation(int id) throws EmployeeException {
        Iterator<Employee> i = list.iterator();
        while (i.hasNext()) {
            if (i.next().getId() == id) {
                throw new EmployeeException("No puede haber 2 números de cedula iguales");
            }
        }
        return true;
    }
}
