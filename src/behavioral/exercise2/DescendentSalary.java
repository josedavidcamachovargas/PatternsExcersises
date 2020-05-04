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
 * Clase que maneja un ordenamiento descendente de acuerdo con los salarios
 */
public class DescendentSalary implements InterfaceSort {

    @Override
    public void sort(ArrayList<Employee> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).getSalary() < list.get(j+1).getSalary()) {
                    compareName(j, list);
                }
            }
        }
    }
    
    /*Este metodo se encarga de la operacion que se haria en ascendingSurename
    en la cual se guarda un empleado llamado aux, el cual va a guardar un empleado
    de una posicion especifica, luego al empleado el cual se compara se le hace un
    set con un indice y con el empleado siguiente, y por ultimo se hace el mismo set
    pero esta vez guardando la posicion que teniamos del aux*/
    private void compareName(int position, ArrayList<Employee> list){
        Employee aux;
        aux = list.get(position);
        list.set(position, list.get(position+1));
        list.set(position+1, aux);
    }
    
}
