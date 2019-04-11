package iSoccer2;

import java.util.ArrayList;

public class ResourceIterator implements Iterator{
	
	protected ArrayList<Resource> resources;
	protected int index=0;
	
	public ResourceIterator(ArrayList<Resource> resources) {
	
		this.resources = resources;
	}
	
	@Override
	public boolean hasNext() {
		if (index >= resources.size() || resources.get(index)==null)
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
		Resource resource = resources.get(index);
		index++;
		return resource;
	}	

}
