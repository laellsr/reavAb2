package iSoccer2;

public class Partner extends Person
{
	String adress;
	boolean pay;
	SupportPlans myPlan;
	
	public Partner(String name, String email, String CPF, String phone, String adress, boolean pay) {
		super(name, email, CPF, phone);
		this.adress = adress;
		this.pay = pay;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public boolean isPay() {
		return pay;
	}

	public void setPay(boolean pay) {
		this.pay = pay;
	}
	
	public void setMyPlan(SupportPlans myPlan)
	{
		this.myPlan = myPlan;
	}
	
	public SupportPlans getMyPlan() {
		return myPlan;
	}
	
	
}
