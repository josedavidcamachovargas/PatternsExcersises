/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.exercise2;

import java.util.ArrayList;

/**
 *
 * @author Andrés Antonio Gonzalez Orozco B83477
 * @author José David Camacho Vargas B91484
 * 
 * Esta clase crea un objeto que hace referencia al departamento de una
 * determinada empresa, el cual puede tener a su vez sub-departamentos
 * 
 * Clase para desarrollar una forma flexible de crear estructuras de árbol
 * jerárquicas de complejidad arbitraria, al tiempo que permite que cada
 * elemento de la estructura funcione con una interfaz uniforme.
 */
public class Department implements DepartmentItem {
    private String departmentName;
    private Employee inCharge;
    private ArrayList<EmployeeItem> employeeList;
    private ArrayList<DepartmentItem> subDepartmentList;

    public Department() {
        employeeList = new ArrayList<>();
        subDepartmentList = new ArrayList<>();
    }

    public Department(String departmentName, Employee inCharge) {
        this.departmentName = departmentName;
        this.inCharge = inCharge;
        this.employeeList = new ArrayList<>();
        this.subDepartmentList = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee getInCharge() {
        return inCharge;
    }

    public void setInCharge(Employee inCharge) {
        this.inCharge = inCharge;
    }

    public ArrayList<EmployeeItem> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<EmployeeItem> employeeList) {
        this.employeeList = employeeList;
    }

    public ArrayList<DepartmentItem> getSubDepartmentList() {
        return subDepartmentList;
    }

    public void setSubDepartmentList(ArrayList<DepartmentItem> subDepartmentList) {
        this.subDepartmentList = subDepartmentList;
    }

    @Override
    public int getTotalEmployees() {
        int total = 0;
        for (DepartmentItem department : subDepartmentList) {
            total += department.getTotalEmployees();
        }
        return total + employeeList.size();
    }

    @Override
    public void getEmployeesByDepartment() {
        for (DepartmentItem department : subDepartmentList) {
            System.out.println("Nombre del departamento: " + ((Department)department).getDepartmentName()
                             + ".\nCantidad de empleados: " + department.getTotalEmployees());
        }
    }
    
    public void addDepartmentItem(DepartmentItem department) {
        if (!subDepartmentList.contains(department)) {
            subDepartmentList.add(department);
        }
    }

    public void removeProjectItem(DepartmentItem department) {
        subDepartmentList.remove(department);
    }

    public void addEmployee(EmployeeItem employee) {
        if (!employeeList.contains(employee)) {
            employeeList.add(employee);
        }
    }

    public void removeEmployee(EmployeeItem employee) {
        employeeList.remove(employee);
    }

    @Override
    public String toString() {
        return "Department: " + "Nombre del departamento = " + departmentName
             + ".\nEncargado = " + inCharge + ".\nLista de empleados = " + employeeList.toString()
             + ".\nLista de sub-departamentos = " + subDepartmentList.toString() + ".";
    }
    
    
    
    
}
