package iSoccer2;

import java.util.ArrayList;

public class PersonIterator implements Iterator{
	
	protected ArrayList<Person> persons;
	protected int index=0;
	
	public PersonIterator(ArrayList<Person> persons) {
	
		this.persons = persons;
	}
	
	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return null;
	}
	

}
