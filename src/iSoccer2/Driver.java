package iSoccer2;

public class Driver extends Employee
{
	String cnhNumber;
	public Driver() {
		super();
		setCnhNumber();;
	}
	
	public String getCnhNumber() {
		return cnhNumber;
	}
	public void setCnhNumber() {
		Menu.driverCnh();
		this.cnhNumber = input.nextLine();
	}

}
	