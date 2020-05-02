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
 * @author Andres Gonzalez
 */
public class Employee_Array {
    private ArrayList<Employee> list;

    public Employee_Array() {
        list = new ArrayList<Employee>();
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
    
    private Employee idValidation(int id) {
        Iterator<Employee> i = list.iterator();
        while (i.hasNext()) {
            if(i.next().getId() == id){
                System.out.println("No puede haber 2 numeros de cedula iguales");
            }
        }
        return null;
    }

}
