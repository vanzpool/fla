package model.indomie;

import model.egg.Egg;
import model.sauce.Sauce;
import model.vegetable.Vegetable;

public class IndomieSoto extends Indomie {

	public IndomieSoto() {
		// TODO Auto-generated constructor stub
		name = "Soto";
	}
	public IndomieSoto(Egg egg, Sauce sauce, Vegetable[] vegetables){
		this.name = "Soto";
		this.egg = egg;
		this.sauce = sauce;
		this.vegetables = vegetables;
	}
}
