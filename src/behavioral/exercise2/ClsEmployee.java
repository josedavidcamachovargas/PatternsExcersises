/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.exercise2;

/**
 * @author Andrés Antonio González Orozco B83477  
 * @author José David Camacho Vargas B91484
 * Esta clase se encarga de crear un empleado con sus
 * diferentes metodos set, get y toStrin
 */
public class ClsEmployee {
    private int id;
    private String firstName;
    private String secondName;
    private String surename;
    private String secondSurename;
    private int salary;

    public ClsEmployee(int id, String firstName, String secondName, String surename, String secondSurename, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.surename = surename;
        this.secondSurename = secondSurename;
        this.salary = salary;
    }

    public ClsEmployee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getSecondSurename() {
        return secondSurename;
    }

    public void setSecondSurename(String secondSurename) {
        this.secondSurename = secondSurename;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Empleado: " + "\nCédula" + id + "\nPrimer nombre: " + firstName +
                "\nSegundo nombre: " + secondName + "\nApellido: " + surename + 
                "\nSegundo apellido: " + secondSurename + "\nSalario: " + salary + "\n";
    }
    
    
}
