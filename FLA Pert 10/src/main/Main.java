package main;

import iterator.AirplaneList;
import iterator.Iterator;
import model.Airplane;
import model.AirportTower;
import model.GarudaAirlines;
import model.LionAir;
import model.SingaporeAirlines;

public class Main {

	public Main() {
		LionAir JT610 = new LionAir("Kuala Lumpur");
		SingaporeAirlines SQ82 = new SingaporeAirlines("Changi");
		GarudaAirlines GA55 = new GarudaAirlines("Soekarno Hatta");
//		Vector<Airplane> allFlights = new Vector<>();
//		allFlights.add(JT610);
//		allFlights.add(SQ82);
//		allFlights.add(GA55);
		
		AirplaneList allFlights = new AirplaneList();
		allFlights.addVector(JT610);
		allFlights.addVector(SQ82);
		allFlights.addVector(GA55);
		
		AirportTower at = new AirportTower("Soekarno Hatta");
		
		System.out.println("Arrival");
		for(Iterator it = allFlights.getIterator(); it.hasNext();){
			Airplane currAirplane = (Airplane)it.next();
			at.getArrival(currAirplane);
		}
//		for (Airplane airplane : allFlights) {
//			at.getArrival(airplane);
//		}
		
		System.out.println("Departure");
//		for (Airplane airplane : allFlights) {
//			at.setDeparture(airplane);}
		for (Iterator it = allFlights.getIterator();it.hasNext();){
			Airplane currAirplane = (Airplane)it.next();
			at.setDeparture(currAirplane);
		}
		
		for(Iterator it = allFlights.getIterator().last();it.hasPrev();){
			Airplane currAirplane = (Airplane)it.prev();
			System.out.println("Name: " + currAirplane.getAirplaneName());
		}
		
		
	}

	

	public static void main(String[] args) {

		new Main();

	}

}
