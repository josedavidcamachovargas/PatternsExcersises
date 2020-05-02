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

    private ArrayList<ClsEmployee> list;

    public Employee_Array() {
        list = new ArrayList<ClsEmployee>();
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

    private void idValidation(int id) throws EmployeeException {
        Iterator<ClsEmployee> i = list.iterator();
        while (i.hasNext()) {
            if (i.next().getId() == id) {
                throw new EmployeeException("No puede haber 2 números de cedula iguales");
            }
        }
    }
}
