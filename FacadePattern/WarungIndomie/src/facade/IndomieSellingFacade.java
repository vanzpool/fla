package facade;

import model.indomie.Indomie;
import util.indomie.IndomieCashier;
import util.indomie.IndomieCooker;
import util.indomie.IndomieMenu;
import util.indomie.IndomieSeller;

public class IndomieSellingFacade {
	
	private IndomieMenu indomieMenu;
	private IndomieSeller indomieSeller;
	private IndomieCooker indomieCooker;
	private IndomieCashier indomieCashier;
	
	
	

	public IndomieSellingFacade() {
		// TODO Auto-generated constructor stub
		indomieMenu = new IndomieMenu();
		indomieSeller = new IndomieSeller();
		indomieCooker = new IndomieCooker();
		indomieCashier = new IndomieCashier();
	}
	
	public void showMenu(){
		System.out.println("Request Menu....");
		
		indomieMenu.printMenu();
	}

	public void order(String name, String egg, String sauce, String[] vegetables){
		for ( Indomie indomie : indomieMenu.getMenu()) {
			if(indomie.getName().equals(name) && indomie.getEgg().getName().equals(egg) && indomie.getSauce().getName().equals(sauce)){
				
				boolean vegetableExists = true;
				for (int i = 0; i < vegetables.length; i++) {
					if (!indomie.getVegetables()[i].getName().equals(vegetables[i])){
						vegetableExists = false;
						break;
					}
				}
				
				if(vegetableExists){
					System.out.println("Indomie found and will be cooked");
					
					indomieCooker.prepareEgg(indomie.getEgg());
					indomieCooker.prepareSauce(indomie.getSauce());
					indomieCooker.prepareVegetables(indomie.getVegetables());
					Indomie temp = indomieCooker.cook(indomie);
					temp = indomieCooker.decorate(indomie);
					
					indomieSeller.order(temp);
					
					return;
				}
			}
		}
		
		System.out.println("Indomie not found and will not be cooked");
	}
	
	public void pay(){
		indomieCashier.pay();
	}
	
}
