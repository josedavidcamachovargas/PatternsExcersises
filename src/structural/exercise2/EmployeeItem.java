/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.exercise2;

import java.io.Serializable;

/**
 *
 * @author Andrés Antonio Gonzalez Orozco B83477
 * @author José David Camacho Vargas B91484
 * 
 * Clase para desarrollar una forma flexible de crear estructuras de árbol
 * jerárquicas de complejidad arbitraria, al tiempo que permite que cada
 * elemento de la estructura funcione con una interfaz uniforme.
 */
public interface EmployeeItem extends Serializable {
    public String getName();
    public void setName(String name);
    public String getId();
    public void setId(String name);
}
