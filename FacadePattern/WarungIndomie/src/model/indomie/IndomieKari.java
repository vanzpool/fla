package model.indomie;

import model.egg.Egg;
import model.sauce.Sauce;
import model.vegetable.Vegetable;

public class IndomieKari extends Indomie {

	public IndomieKari() {
		// TODO Auto-generated constructor stub
		name = "Kari";
	}

	public IndomieKari(Egg egg, Sauce sauce, Vegetable[] vegetables){
		this.name = "Kari";
		this.egg = egg;
		this.sauce = sauce;
		this.vegetables = vegetables;
	}
}
