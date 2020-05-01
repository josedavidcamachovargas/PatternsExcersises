/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Builder;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Andrés Antonio Gonzalez Orozco B83477
 * @author José David Camacho Vargas B91484
 */
public class Project {
    
    private String projectName;
    private Employee inCharge;
    private int weeks;
    private ArrayList<Date> dates = new ArrayList<>();

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Employee getInCharge() {
        return inCharge;
    }

    public void setInCharge(Employee inCharge) {
        this.inCharge = inCharge;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    public ArrayList<Date> getDates() {
        return dates;
    }

    public void setDates(ArrayList<Date> dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "Proyecto: " + "Nombre del proyecto = " + projectName + ". Encargado = " + inCharge
             + ". Semanas = " + weeks + ". Lista de fechas = " + dates + "";
    }

    
    
}
