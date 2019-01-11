package util.indomie;

import java.util.Vector;

import model.indomie.Indomie;

public class IndomieSeller {
	
	private Vector<Indomie> indomies;

	public IndomieSeller() {
		// TODO Auto-generated constructor stub
		indomies = new Vector<>();
	}

	
	public void order(Indomie indomie){
		indomies.add(indomie);
	}
	
	public void cancel(int index){
		indomies.remove(index);
	}
	
	public Vector<Indomie> getAllOrder(){
		return indomies;
	}
	
	public void printOrder(){
		for (Indomie indomie : indomies) {
			System.out.println(indomie.getName() + " " 
					+ indomie.getEgg().getName() + " "
					+ indomie.getSauce().getName());
			
			for(int i = 0;i<3; i++){
				System.out.println(indomie.getVegetables()[i].getName());
			}
		}
	}
	
}
