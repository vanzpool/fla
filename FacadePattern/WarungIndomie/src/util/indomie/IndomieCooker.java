package util.indomie;

import model.egg.Egg;
import model.indomie.Indomie;
import model.sauce.Sauce;
import model.vegetable.Vegetable;

public class IndomieCooker {
	
	
	
	public IndomieCooker() {
		// TODO Auto-generated constructor stub
	}

	public void prepareEgg(Egg egg){
		System.out.println(egg.getName() + " is prepared");
	}
	
	public void prepareSauce(Sauce sauce){
		System.out.println(sauce.getName()+ " is prepared");
	}
	
	public void prepareVegetables(Vegetable[] vegetables){
		for(int i =0;i<3;i++){
			System.out.println(vegetables[i].getName() + " is prepared");
		}
	}
	public Indomie cook(Indomie indomie){
		System.out.println(indomie.getName() + " is cooked");
		return indomie;
	}
	
	public Indomie decorate(Indomie indomie){
		System.out.println(indomie.getName() + " is decorated");
		return indomie;
	}
	
	
}
