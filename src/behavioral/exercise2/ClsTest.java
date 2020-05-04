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
public class ClsTest {
    public static void main(String args[]) throws EmployeeException {
    Employee_Array array = new Employee_Array();
    ClsEmployee e1 = new ClsEmployee(123456, "Andres", "Antonio", "Gonzalez", "Orozco", 20000);
    ClsEmployee e2 = new ClsEmployee(234567, "José", "David", "Camacho", "Vargas", 30000);
    ClsEmployee e3 = new ClsEmployee(345678, "Daniel", "Jose", "Rodriguez", "Vazques", 40000);
    ClsEmployee e4 = new ClsEmployee(456789, "Adrian", "Manuel", "Viquez", "Mora", 50000);
    ClsEmployee e5 = new ClsEmployee(567890, "Erick", "Jesus", "Ramirez", "Campos", 60000);
    
    array.add(e4);
    array.add(e2);
    array.add(e5);
    array.add(e1);
    array.add(e3);
    
    System.out.println("Lista de empleados: " + array.toString() + "\n\n");
    array.ascendingId();
    System.out.println("Lista de empleados ordenada por el # de cédula: " + array.toString()+ "\n\n");
    
    array.ascendingSurename();
    System.out.println("Lista de empleados ordenada por el apellido: " + array.toString()+ "\n\n");
    
//    array.descendentSalary();
//    System.out.println("Lista de empleados ordenada por el salario: " + array.toString()+ "\n\n");
//    
    }
}
