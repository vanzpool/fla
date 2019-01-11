import database.RockyDatabase;
import template.TransactionTemplate;

public class OnlineTransaction extends TransactionTemplate {

	public OnlineTransaction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		System.out.println("Online Payment");
	}
	
	@Override
	public boolean checkAvailability() {
		RockyDatabase db = RockyDatabase.getInstance();
		if(getItemCount() + 5 > db.getStock()){
			System.out.println("Stock not enough");
			return false;
		}
		else{
			System.out.println("Stock enough");
		}
		return true;
	}
	
	@Override
	public void decreaseStock() {
		RockyDatabase db = RockyDatabase.getInstance();
		
		int temp = db.getStock() - (getItemCount() * 2);
		db.setStock(temp);
	}
	
	}


