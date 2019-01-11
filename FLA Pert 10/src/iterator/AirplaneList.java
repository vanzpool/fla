package iterator;

import java.util.Vector;

import model.Airplane;

public class AirplaneList implements Container{

	private Vector<Airplane> airplaneList;
	
	public AirplaneList() {
		airplaneList = new Vector<>();
	}

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new AirplaneIterator(airplaneList);
	}
	
	public void addVector(Airplane a){
		airplaneList.add(a);
	}

}
