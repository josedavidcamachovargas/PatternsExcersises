/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.exercise1;

import java.text.SimpleDateFormat;

/**
 *
 * @author Andrés Antonio Gonzalez Orozco B83477
 * @author José David Camacho Vargas B91484
 */
public class ArrivalFlightDisplay implements Observer, DisplayElement{
    private Flight flight;
    private Airport airport;

    public ArrivalFlightDisplay(Airport airport) {
        this.airport = airport;
        airport.registerObserver(this);
    }

    @Override
    public void update(Flight flight) {
        if (flight.getFlightType().equals("Llegada")) {
            this.flight = flight;
            display();
        }
    }

    @Override
    public void display() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy - mm:ss:S");
        String dateString = formatter.format(flight.getDate().getTime());
        System.out.println("La Aerolínea " + flight.getAirline() + "notifica la"
                + " llegada del vuelo número " + flight.getFlightNumber()
                + " proveniente de " + flight.getCountry()
                + ".\n Puerta número: " + flight.getGateNumber()
                + ".\n Hora de llegada: " + dateString + ".");
    }
    
    
    
}
