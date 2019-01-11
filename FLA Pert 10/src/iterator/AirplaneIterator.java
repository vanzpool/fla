package iterator;

import java.util.Vector;

import model.Airplane;

public class AirplaneIterator implements Iterator {
	
	private Vector<Airplane> aList;
	private int index;

	public AirplaneIterator(Vector<Airplane> a) {
		this.aList = a;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		return index < aList.size();
	}

	@Override
	public Object next() {
		
		return aList.get(index++);
	}

	public Iterator last(){
		this.index = aList.size() - 1;
		return this;
	}
	
	@Override
	public boolean hasPrev() {
		
		return index >= 0;
	}

	@Override
	public Object prev() {
		return aList.get(index--);
	}

}
