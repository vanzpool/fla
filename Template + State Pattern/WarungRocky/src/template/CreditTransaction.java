package template;

public class CreditTransaction extends TransactionTemplate {

	public CreditTransaction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		if(checkCredibility())
		{
			payment();
		}
		else{
			System.out.println("Credit payment failed");
		}
	}
	
	
	public boolean checkCredibility(){
		return true;
	}
	
	public void payment(){
		System.out.println("Payment is Credit");
	}
}
