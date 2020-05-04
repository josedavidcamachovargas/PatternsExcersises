/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.exercise2;

import java.util.ArrayList;

/**
 *
 * @author Andrés Antonio González Orozco B83477  
 * @author José David Camacho Vargas B91484
 * 
 * Usado para definir un grupo de clases que representan un conjunto de
 * posibles comportamientos.
 */
public class SortingEmployee {
    private InterfaceSort sorter = null;

    public InterfaceSort getSorter() {
        return sorter;
    }

    public void setSorter(InterfaceSort sorter) {
        this.sorter = sorter;
    }

    public void sortEmployee(ArrayList<Employee> list) {
        sorter.sort(list);
    }
}
