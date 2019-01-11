package sections;

import java.util.Vector;

import interfaces.Observable;
import interfaces.Observer;
import models.Indomie;

public class Receptionist implements Observable {
	
	private Vector<Observer> observers;
	
	private Vector<Indomie> indomies;

	public Receptionist() {
		// TODO Auto-generated constructor stub
		observers = new Vector<>();
		indomies = new Vector<>();
		
		attach(new Kitchen());
		attach(new Decorator());
		attach(new Cashier());
	}
	
	public void order(Indomie indomie){
		indomies.add(indomie);
	}
	
	public void checkout(){
		notify(indomies);
		
		indomies.clear();
	}

	@Override
	public void attach(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public Observer detach(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
		
		return o;
	}

	@Override
	public void notify(Object o) {
		// TODO Auto-generated method stub
		
		for(Observer observer : observers){
			observer.update(o);
		}
		
	}

}
