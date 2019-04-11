package iSoccer2;

import java.util.Scanner;

public abstract class Resource {
	
	Scanner input = new Scanner(System.in);
	protected String name;
	protected boolean avaliable;

	public Resource() {
		setName();
	}

	public String getName() {
		return name;
	}

	public void setName() {
		Menu.personName();
		this.name = input.nextLine();
		this.name = this.name.toUpperCase();
	}

	public void isAvailable() {
		if(avaliable)
			Menu.resourceIsAvaliable();
		else
			Menu.resourceIsNotAvaliable();
	}

	public void setAvailable() {
		Menu.resourceAvaliable();
		if (input.nextInt()==1) 
			this.avaliable = true;
		else
			this.avaliable = false;
		input.nextLine();
	}
	
}
