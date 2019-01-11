package template;

import database.RockyDatabase;

public abstract class TransactionTemplate {

	private int itemCount;
	
	public TransactionTemplate() {
		// TODO Auto-generated constructor stub
	}
	
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	public int getItemCount() {
		return itemCount;
	}
	
	public boolean checkAvailability(){
		RockyDatabase db = RockyDatabase.getInstance();
		if(itemCount > db.getStock()){
			System.out.println("Stock not enough");
			return false;
		}
		else{
			System.out.println("Stock enough");
		}
		return true;
	}
	
	public abstract void pay();
	
	public void decreaseStock(){
		RockyDatabase db = RockyDatabase.getInstance();
		
		int temp = db.getStock() - itemCount;
		
		db.setStock(temp);
	}
	
	public  void send(){
		System.out.println("Send Rocky");
	}
	
	public void run(){
		if(checkAvailability()){
		pay();
		decreaseStock();
		send();
		}
	}
}
