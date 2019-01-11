package state;

import model.Page;


public class ErrorState extends PageState {

	public ErrorState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(Page page) {
		// TODO Auto-generated method stub
		System.out.println("Page load too long");
	}

}
