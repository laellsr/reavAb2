package iSoccer2;

public class Doctor extends Employee {
	
	String CRM;
	
	public Doctor() {
		super();
		setCRM();
	}

	public String getCRM() {
		return CRM;
	}

	public void setCRM() {
		Menu.doctorCRM();
		this.CRM = input.nextLine();
	}
	

}
