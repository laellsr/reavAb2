package iSoccer2;

public abstract class Person
{
	protected String name, email, CPF, phone;
	
	public Person(String name, String email, String CPF, String phone)
	{
		this.name = name;
		this.email = email ;
		this.CPF = CPF;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
