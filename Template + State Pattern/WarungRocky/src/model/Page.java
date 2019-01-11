package model;

import state.PageState;
import state.PreLoadState;

public class Page {

	private PageState state;
	private boolean loaded;
	
	public Page() {
		this.state = new PreLoadState();
		loaded = false;
	}

	
	public void setState(PageState state){
		this.state = state;
		load();
	}
	
	public void load(){
		state.process(this);
	}


	public boolean isLoaded() {
		return loaded;
	}


	public void setLoaded(boolean loaded) {
		this.loaded = loaded;
	}
	
	
}
