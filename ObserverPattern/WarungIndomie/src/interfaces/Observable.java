package interfaces;

public interface Observable {

	public void attach(Observer o);
	
	public Observer detach(Observer o);
	
	public void notify(Object o);
	
}
