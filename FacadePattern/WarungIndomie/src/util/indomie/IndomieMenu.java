package util.indomie;

import java.util.Vector;

import model.egg.ChickenEgg;
import model.egg.DuckEgg;
import model.indomie.Indomie;
import model.indomie.IndomieGoreng;
import model.indomie.IndomieKari;
import model.indomie.IndomieSoto;
import model.sauce.ChiliSauce;
import model.sauce.SweetSauce;
import model.vegetable.Celery;
import model.vegetable.Chili;
import model.vegetable.Lettuce;
import model.vegetable.Tomato;
import model.vegetable.Vegetable;

public class IndomieMenu {
	
	private Vector<Indomie> indomies;
	
	public IndomieMenu() {
		// TODO Auto-generated constructor stub
		indomies = new Vector<>();
		
		indomies.add(new IndomieSoto(
				new ChickenEgg(),
				new ChiliSauce(),
				new Vegetable[]{
						new Chili(),
						new Tomato(),
						new Lettuce()
				}
				));
		
		indomies.add(new IndomieGoreng(
				new DuckEgg(),
				new SweetSauce(),
				new Vegetable[]{
						new Celery(),
						new Tomato(),
						new Lettuce()
				}
				));
		
		indomies.add(new IndomieKari(
				new DuckEgg(),
				new ChiliSauce(),
				new Vegetable[]{
						new Celery(),
						new Chili(),
						new Lettuce()
				}
				));
	}
	
	public void printMenu(){
		for (Indomie indomie : indomies) {
			System.out.println(indomie.getName() + " " 
					+ indomie.getEgg().getName() + " "
					+ indomie.getSauce().getName());
			
			for(int i = 0;i<3; i++){
				System.out.println(indomie.getVegetables()[i].getName());
			}
		}
	}
	
	public Vector<Indomie> getMenu(){
		return indomies;
	}
	
	}

