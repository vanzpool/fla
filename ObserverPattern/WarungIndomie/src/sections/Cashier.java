package sections;

import java.util.Vector;

import interfaces.Observer;
import models.Indomie;

public class Cashier implements Observer {

	public Cashier() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Object o) {
		// TODO Auto-generated method stub
		Vector<Indomie> indomies = (Vector<Indomie>)o;
		
		int total_price = 0;
		
		for (Indomie indomie : indomies) {
			System.out.println("Calculate price for " + indomie.getName());
			
			total_price += indomie.getPrice();
		}
		System.out.println("Total Price: " + total_price);
	}

}
