package model.indomie;

import model.egg.Egg;
import model.sauce.Sauce;
import model.vegetable.Vegetable;

public abstract class Indomie {
	
	protected String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Egg getEgg() {
		return egg;
	}

	public void setEgg(Egg egg) {
		this.egg = egg;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public Vegetable[] getVegetables() {
		return vegetables;
	}

	public void setVegetables(Vegetable[] vegetables) {
		this.vegetables = vegetables;
	}

	protected Egg egg;
	protected Sauce sauce;
	protected Vegetable[] vegetables;
	
	public Indomie() {
		vegetables = new Vegetable[5];
		// TODO Auto-generated constructor stub
	}

}
