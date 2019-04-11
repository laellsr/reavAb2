package iSoccer2;

import java.util.Scanner;

public abstract class Person
{
	Scanner input = new Scanner(System.in);
	protected String name, email, CPF, phone;
	
	public Person()
	{
		setName(); setEmail(); setCPF(); setPhone();
	}
	public String getName() {
		return name;
	}

	public void setName() {
		Menu.personName();
		this.name = input.nextLine();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail() {
		Menu.personEmail();
		this.email = input.nextLine();
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF() {
		Menu.personCPF();
		this.CPF = input.nextLine();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone() {
		Menu.personPhone();
		this.phone = input.nextLine();
	}
	

}
