import model.Page;
import template.CashGojekTransaction;
import template.CashTransaction;
import template.CreditTransaction;
import template.TransactionTemplate;

public class Main {

	public Main() {
		Page page = new Page();
		page.load();
		
		if (page.isLoaded()) {
			//Template Transaction
			TransactionTemplate tr1 = new CashTransaction();
			tr1.setItemCount(5);
			tr1.run();
			
			System.out.println("============================");
			
			TransactionTemplate tr2 = new CashGojekTransaction();
			tr2.setItemCount(3);
			tr2.run();
			
			System.out.println("============================");
			
			TransactionTemplate tr3 = new CreditTransaction();
			tr3.setItemCount(6);
			tr3.run();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
