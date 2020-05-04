/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.exercise2;

/**
 *
 * @author Andrés Antonio González Orozco B83477  
 * @author José David Camacho Vargas B91484
 * 
 * Esta clase se encarga de hacer las pruebas de los metodos
 * ralizados en la clase Employee_Array y ClsEmployee los cuales son
 * instanceados y probados.
 */
public class Test {
    public static void main(String args[]) throws EmployeeException {
    Employee_Array array = new Employee_Array();
    Employee e1 = new Employee(123456, "Andres", "Antonio", "Gonzalez", "Orozco", 20000);
    Employee e2 = new Employee(234567, "José", "David", "Camacho", "Vargas", 30000);
    Employee e3 = new Employee(345678, "Daniel", "Jose", "Rodriguez", "Vazques", 40000);
    Employee e4 = new Employee(456789, "Adrian", "Manuel", "Viquez", "Mora", 50000);
    Employee e5 = new Employee(567890, "Erick", "Jesus", "Ramirez", "Campos", 60000);
    
    array.add(e4);
    array.add(e2);
    array.add(e5);
    array.add(e1);
    array.add(e3);
    
    
    System.out.println("Lista de empleados: " + array.toString() + "\n\n");
    SortingEmployee sortingEmployee = new SortingEmployee();
    sortingEmployee.setSorter(new AscendingId());
    sortingEmployee.sortEmployee(array.getList());
    System.out.println("Lista de empleados ordenada por el # de cédula: " + array.toString()+ "\n\n");
    
    sortingEmployee.setSorter(new AscendingSurename());
    sortingEmployee.sortEmployee(array.getList());
    System.out.println("Lista de empleados ordenada por el apellido: " + array.toString()+ "\n\n");
    
    sortingEmployee.setSorter(new DescendentSalary());
    sortingEmployee.sortEmployee(array.getList());
    System.out.println("Lista de empleados ordenada por el salario: " + array.toString()+ "\n\n");
    
    }
}
