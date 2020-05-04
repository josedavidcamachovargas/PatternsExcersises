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
 * Clase que maneja un ordenamiento ascendente de acuerdo con los id
 */
public class AscendingId implements InterfaceSort {

    @Override
    public void sort(ArrayList<Employee> list) {
        Employee aux;
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
    
}
