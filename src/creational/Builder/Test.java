/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.Builder;

/**
 *
 * @author Andrés Antonio Gonzalez Orozco B83477
 * @author José David Camacho Vargas B91484
 * 
 */
public class Test {
    public Project createProject(InterfaceBuilder builder,
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
}
