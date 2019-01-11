package main;

import facade.IndomieSellingFacade;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		IndomieSellingFacade facade = new IndomieSellingFacade();
		
		facade.showMenu();
		
		facade.order("Goreng", "Duck", "Sweet",new String[] {"Celery", "Tomato", "Lettuce"});
		
		facade.pay();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
