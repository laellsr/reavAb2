package iSoccer2;

import java.util.ArrayList;

public class PersonIterator implements Iterator{
	
	protected ArrayList<Person> persons;
	protected int index=0;
	
	public PersonIterator(ArrayList<Person> persons) {
	
		this.persons = persons;
	}
	
	public void resetIndex() {
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if (index >= persons.size() || persons.get(index)==null)
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
		Person person = persons.get(index);
		index++;
		return person;
	}	

}
