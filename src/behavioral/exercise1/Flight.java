/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.exercise1;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author Andrés Antonio Gonzalez Orozco B83477
 * @author José David Camacho Vargas B91484
 * 
 * Esta clase crea objetos que representan un vuelo de avión con sus respectivos
 * datos.
 */

public class Flight {
    private String flightNumber;
    private String flightType;
    private String country;
    private String airline;
    private int gateNumber;
    private GregorianCalendar date;

    public Flight() {
    }

    public Flight(String flightNumber, String flightType, String country, String airline, int gateNumber, GregorianCalendar date) {
        this.flightNumber = flightNumber;
        this.flightType = flightType;
        this.country = country;
        this.airline = airline;
        this.gateNumber = gateNumber;
        this.date = date;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy - mm:ss:S");
        String dateString = formatter.format(date.getTime());
        return "Vuelo: " + "\nNúmero de vuelo = " + flightNumber
                         + ".\nTipo de vuelo = " + flightType
                         + ".\nPaís = " + country
                         + ".\nAerolínea = " + airline
                         + ".\nNúmero de puerta = " + gateNumber
                         + ".\nFecha = " + dateString + ".";
    }
    
    
}
