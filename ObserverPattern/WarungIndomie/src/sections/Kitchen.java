package sections;

import java.util.Vector;

import interfaces.Observer;
import models.Indomie;

public class Kitchen implements Observer{

	public Kitchen() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Object o) {
		// TODO Auto-generated method stub
		Vector<Indomie> indomies = (Vector<Indomie>)o;
		
		for(Indomie indomie : indomies){
			System.out.println("Cook " + indomie.getName());
		}
	}

}
