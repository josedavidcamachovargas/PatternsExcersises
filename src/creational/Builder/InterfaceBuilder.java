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
public interface InterfaceBuilder {
    void buildProject();
    void buildInCharge(Employee inCharge);
    void buildWeeks(int weeks);
    void buildDates(ArrayList<Date> dates);
    
    Project getProject() throws BuilderException;
}
