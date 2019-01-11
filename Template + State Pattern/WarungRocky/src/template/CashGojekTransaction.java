package template;

public class CashGojekTransaction extends CashTransaction {

	public CashGojekTransaction() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void send() {
		// TODO Auto-generated method stub
		super.send();
		System.out.println("Send by Gojek");
	}

}
