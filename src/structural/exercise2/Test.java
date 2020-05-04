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
 * Esta clase se encarga de la prueba para los métodos del patrón Composite
 */
public class Test {
    public static void main(String[] args) {
        Department department = (Department)createDepartment();
        System.out.println("Nombre departamento: " + department.getDepartmentName());
        System.out.println("Empleados totales: " + department.getTotalEmployees());
        System.out.println("Empleados por departamento:\n");
        department.getEmployeesByDepartment();
    }
    
    public static Serializable createDepartment () {
        EmployeeItem employee1 = new Employee("David", "207650954");
        EmployeeItem employee2 = new Employee("Andrés", "205460464");
        EmployeeItem employee3 = new Employee("Alejandro", "207810546");
        EmployeeItem employee4 = new Employee("Natalia", "207840441");
        EmployeeItem employee5 = new Employee("Flor", "204430463");
        Department department1 = new Department("Cómputo", (Employee)employee5);
        Department department2 = new Department("Electricidad", (Employee)employee1);
        Department department3 = new Department("Gerencia", (Employee)employee3);
        Department department4 = new Department("Docencia", (Employee)employee4);
        Department department5 = new Department("Economía", (Employee)employee2);
        department1.addEmployee(employee2);
        department1.addEmployee(employee3);
        department2.addEmployee(employee1);
        department2.addEmployee(employee5);
        department3.addEmployee(employee2);
        department3.addEmployee(employee3);
        department3.addEmployee(employee4);
        department1.addDepartmentItem(department2);
        department1.addDepartmentItem(department3);
        department1.addDepartmentItem(department4);
        department1.addDepartmentItem(department5);
        return department1;
    }
}
