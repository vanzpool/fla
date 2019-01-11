package model.indomie;

import model.egg.Egg;
import model.sauce.Sauce;
import model.vegetable.Vegetable;

public class IndomieGoreng extends Indomie {

	public IndomieGoreng() {
		// TODO Auto-generated constructor stub\]
		name = "Goreng";
	}

	public IndomieGoreng(Egg egg, Sauce sauce, Vegetable[] vegetables){
		this.name = "Goreng";
		this.egg = egg;
		this.sauce = sauce;
		this.vegetables = vegetables;
	}
}
