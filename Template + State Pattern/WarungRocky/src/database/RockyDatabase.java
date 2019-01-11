package database;

public class RockyDatabase {
	
	private int stock;
	
	private static RockyDatabase instance;
	
	public static RockyDatabase getInstance(){
		return instance == null ?
				(instance =  new RockyDatabase()) :
					instance;
	}

	private RockyDatabase() {
		stock = 10;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int getStock() {
		return stock;
	}

}
