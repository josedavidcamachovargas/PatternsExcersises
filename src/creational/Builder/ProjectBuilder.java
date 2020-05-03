/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author Andrés Antonio Gonzalez Orozco B83477
 * @author José David Camacho Vargas B91484
 * 
 * Para simplificar la creación de objetos complejos definiendo una clase cuyo
 * propósito es construir instancias de otra clase.
 */
public class ProjectBuilder implements InterfaceBuilder {
    protected Project project;
    
    @Override
    public void buildProject() {
        project = new Project();
    }
    
    @Override
    public void buildInCharge(Employee inCharge) {
        if (!"".equals(inCharge.getId()) && inCharge.getId() != null) {
            project.setInCharge(inCharge);
        }
    }
    
    @Override
    public void buildWeeks(int weeks) {
        if (weeks > 0) {
            project.setWeeks(weeks);
        }
    }
    
    @Override
    public void buildDates(ArrayList<Date> dates) {
        if (dates.size() >= 1) {
            Collections.sort(dates);
            project.setDates(dates);
        }
    }
    
    @Override
    public Project getProject() throws BuilderException {
        if (project.getInCharge() == null) {
            throw new BuilderException("El encargado del proyecto o su cédula son nulos");
        }
        if (project.getWeeks() == 0) {
            throw new BuilderException("El tiempo ingresado es menor o igual a 0");
        }
        if (project.getDates() == null || project.getDates().size() == 0) {
            throw new BuilderException("La lista de fechas es nula o está vacía");
        }
        return project;
    }
}
