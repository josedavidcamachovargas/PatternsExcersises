/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.exercise1;

import java.util.GregorianCalendar;

/**
 *
 * @author Andrés Antonio Gonzalez Orozco B83477
 * @author José David Camacho Vargas B91484
 */
public class Test {
    public static void main(String[] args) {
        Airport airport = new Airport();
        
        ArrivalFlightDisplay arrivalFlightDisplay = new ArrivalFlightDisplay(airport);
        DepartureFlightDisplay departureFlightDisplay = new DepartureFlightDisplay(airport);
        BothTypesDisplay bothTypesDisplay = new BothTypesDisplay(airport);
        
        GregorianCalendar date1 = (GregorianCalendar) GregorianCalendar.getInstance();
        Flight flight1 = new Flight("123queso", "Llegada", "España", "Iberia", 7, date1);
        
        GregorianCalendar date2 = (GregorianCalendar) GregorianCalendar.getInstance();
        Flight flight2 = new Flight("154patata", "Llegada", "Brasil", "Janeiro", 4, date2);
        
        GregorianCalendar date3 = (GregorianCalendar) GregorianCalendar.getInstance();
        Flight flight3 = new Flight("785berenjena", "Salida", "Japón", "Tokio", 3, date3);
        
        GregorianCalendar date4 = (GregorianCalendar) GregorianCalendar.getInstance();
        Flight flight4 = new Flight("C19coronado", "Llegada", "China", "Hong Kong", 14, date4);
        
        GregorianCalendar date5 = (GregorianCalendar) GregorianCalendar.getInstance();
        Flight flight5 = new Flight("Sierra117", "Salida", "Estados Unidos", "Iberia", 5, date5);
        airport.setFlight(flight1);
        airport.setFlight(flight2);
        airport.setFlight(flight3);
        airport.setFlight(flight4);
        airport.setFlight(flight5);

    }
}
