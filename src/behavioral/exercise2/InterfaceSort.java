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
 * Esta interfaz se encarga de crear los metodos de odenamiento los cuales 
 * seran utilizados en la clase Employee_Array para diferentes ordenamientos 
 * de los empleados agregados en el ArrayList
 * 
 * Usado para definir un grupo de clases que representan un conjunto de
 * posibles comportamientos.
 */
public interface InterfaceSort {
    
    public void sort(ArrayList<Employee> list);
}
