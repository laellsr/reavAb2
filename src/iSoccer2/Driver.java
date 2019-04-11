package iSoccer2;

public class Driver extends Employee
{
	String cnhNumber;
	public Driver(String name, String email, String CPF, String phone, double salary, String cnhNumber) {
		super(name, email, CPF, phone, salary);
		this.cnhNumber = cnhNumber;
	}
	
}
