package state;

import java.util.Date;

import model.Page;

public class PreLoadState extends PageState {

	public PreLoadState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(Page page) {
		// TODO Auto-generated method stub
		Date date = new Date();
		
		System.out.println("This page is request on " + date.toString());
		
		page.setState(new OnLoadState());
	}

}
