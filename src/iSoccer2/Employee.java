package iSoccer2;

public abstract class Employee extends Person
{
	double salary;
	
	public Employee() {
		super();
		setSalary();
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary() {
		Menu.employeeSalary();
		this.salary = input.nextDouble(); input.nextLine();
	}
	
}
