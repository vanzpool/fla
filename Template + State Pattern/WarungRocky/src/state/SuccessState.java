package state;

import model.Page;

public class SuccessState extends PageState {

	public SuccessState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(Page page) {
		// TODO Auto-generated method stub
		System.out.println("Page load successfully");
		page.setLoaded(true);
	}

}
