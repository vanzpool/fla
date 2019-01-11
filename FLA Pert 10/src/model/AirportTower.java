package model;

import java.util.Vector;

import mediator.Mediator;

public class AirportTower implements Mediator{
	
	public Vector<Airplane> departureFlights;
	public Vector<Airplane> arrivalFlights;
	public String airportName;

	public AirportTower(String airportName) {
		departureFlights = new Vector<>();
		arrivalFlights = new Vector<>();
		this.airportName = airportName;
		
	}

	@Override
	public void getArrival(Airplane a) {
		// TODO Auto-generated method stub
		if(a.getOrigin() != airportName){
			arrivalFlights.add(a);
			System.out.println("Welcome to " + airportName);
			System.out.println("Airplane Name " + a.getAirplaneName());
		}
	}

	@Override
	public void setDeparture(Airplane a) {
		// TODO Auto-generated method stub
		if(a.getOrigin() == airportName){
			departureFlights.add(a);
			System.out.println("See You Soon");
			System.out.println("Airplane Name " + a.getAirplaneName());
		
	}

	}
}