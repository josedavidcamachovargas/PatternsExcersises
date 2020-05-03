/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrés Antonio Gonzalez Orozco B83477
 * @author José David Camacho Vargas B91484
 * 
 * Prueba del patrón builder
 */
public class Test {
    
    private static Calendar dateCreator = Calendar.getInstance();
    private static ArrayList<Date> dates = new ArrayList<>();
    
    public static void main(String[] args) {
        Project project1 = null;
        InterfaceBuilder builder = new ProjectBuilder();
        
        Employee employee1 = new Employee();
        employee1.setId("207650954");
        employee1.setName("David");
        
        addDate(2012, 12, 12);
        addDate(1997, 5, 6);
        addDate(1968, 9, 24);
        addDate(2018, 12, 24);
        addDate(2020, 1, 1);
        
        try {
            System.out.println("Prueba proyecto funcional");
            project1 = createProject(builder, employee1, 5, dates);
            project1.setProjectName("Proyecto 1");
            System.out.println(project1);
        } catch (BuilderException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        Project project2 = null;
        Employee employee2 = new Employee();
        employee1.setId("");
        employee1.setName("Andrés");
        dates.clear();
        addDate(2017, 11, 11);
        addDate(1957, 3, 8);
        addDate(1998, 7, 22);
        addDate(2008, 10, 20);
        addDate(2010, 10, 2);
        
        try {
            System.out.println("\n\nPrueba proyecto con cédula vacía");
            project1 = createProject(builder, employee1, 7, dates);
            project1.setProjectName("Proyecto 2");
            System.out.println(project2);
        } catch (BuilderException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        Project project3 = null;
        Employee employee3 = new Employee();
        employee1.setId("207810741");
        employee1.setName("Alejandro");
        dates.clear();
        addDate(2017, 11, 11);
        addDate(1957, 3, 8);
        addDate(1998, 7, 22);
        addDate(2008, 10, 20);
        addDate(2010, 10, 2);
        
        try {
            System.out.println("\n\nPrueba proyecto con tiempo igual a 0");
            project1 = createProject(builder, employee1, 0, dates);
            project1.setProjectName("Proyecto 3");
            System.out.println(project3);
        } catch (BuilderException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        Project project4 = null;
        Employee employee4 = new Employee();
        employee1.setId("204960541");
        employee1.setName("Natalia");
        dates.clear();
        
        try {
            System.out.println("\n\nPrueba proyecto con lista de fechas vacía");
            project1 = createProject(builder, employee1, 8, dates);
            project1.setProjectName("Proyecto 4");
            System.out.println(project4);
        } catch (BuilderException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static Project createProject(InterfaceBuilder builder,
            Employee inCharge, int weeks, ArrayList<Date> dates) throws BuilderException {
        if (builder == null) {
            builder = new ProjectBuilder();
        }
        builder.buildProject();
        builder.buildInCharge(inCharge);
        builder.buildWeeks(weeks);
        builder.buildDates(dates);
        return builder.getProject();
    }
    
    public static void addDate(int year, int month, int date) {
        dateCreator.set(year, month, date);
        dates.add(dateCreator.getTime());
    }
}
