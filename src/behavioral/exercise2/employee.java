/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.exercise2;

/**
 *
 * @author Andres Gonzalez
 */
public class employee {
    private int id;
    private String firstName;
    private String secondName;
    private String surname;
    private String secondSurname;
    private int salary;

    public employee(int id, String firstName, String secondName, String surname, String secondSurname, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.secondSurname = secondSurname;
        this.salary = salary;
    }

    public employee() {
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Empleado: "  + "\nPrimer nombre" + firstName + 
                "\nSegundo nombre: " + secondName + "\nApellido: " + surname + 
                "\nSegundo Apellido: " + secondSurname+ "\nCédula: " + id + "\nSalario: " + salary;
    }

}
