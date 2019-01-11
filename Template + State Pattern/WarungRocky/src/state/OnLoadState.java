package state;

import java.util.Random;

import model.Page;

public class OnLoadState extends PageState {

	public OnLoadState() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void process(Page page) {
		// TODO Auto-generated method stub
		System.out.print("Loading");
		
		Random rand = new Random();
		int time = rand.nextInt(5);
		
		for (int i = 0; i < time; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
		page.setState(time < 3 ? new SuccessState() : new ErrorState());
	}

}
