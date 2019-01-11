package iterator;

public interface Iterator {

	public boolean hasNext();
	public Object next();
	public boolean hasPrev();
	public Object prev();
	public Iterator last();
	
}
