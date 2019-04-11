package iSoccer2;

public abstract class Employee extends Person
{
	double salary;
	
	public Employee(String name, String email, String CPF, String phone, double salary) {
		super(name, email, CPF, phone);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
