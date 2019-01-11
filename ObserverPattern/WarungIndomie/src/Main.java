import java.util.Scanner;

import models.Indomie;
import sections.Receptionist;

public class Main {

	private Scanner scan = new Scanner(System.in);
	
	public Main() {
		// TODO Auto-generated constructor stub
		int choose = 0;
		Receptionist receptionist = new Receptionist();
		
		do {
			System.out.println("1. Order Indomie");
			System.out.println("2. Check Out");
			System.out.println("3. Exit");
			System.out.println("Choose: ");
			choose = scan.nextInt(); scan.nextLine();
			
			switch (choose) {
			case 1:
				String name = "";
				int price = 0;
				
				do{
				System.out.print("Input name [Soto | Goreng]: ");
				name = scan.nextLine();
				}while(!name.equals("Soto") && !name.equals("Goreng"));
				
				if(name.equals("Soto")) price = 1000;
				else price = 1500;
				
				Indomie indomie = new Indomie();
				indomie.setName(name);
				indomie.setPrice(price);
				
				receptionist.order(indomie);
				
				System.out.println();
				break;

			case 2:
				receptionist.checkout();
				break;
			}
		} while (choose != 3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
