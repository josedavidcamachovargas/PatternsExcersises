/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.exercise1;

import java.util.ArrayList;

/**
 *
 * @author Andrés Antonio Gonzalez Orozco B83477
 * @author José David Camacho Vargas B91484
 */
public class Airport implements ManageObserver{
    private ArrayList<Observer> flightList;
    private Flight flight;

    public Airport() {
        flightList = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer observer) {
        flightList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = flightList.indexOf(observer);
        if (i >= 0) {
            flightList.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < flightList.size(); i++) {
            Observer observer = (Observer) flightList.get(i);
            observer.update(flight);
        }
    }

    public void flightAdded() {
        notifyObservers();
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
        flightAdded();
    }

    public Flight getFlight() {
        return flight;
    }
    
}
