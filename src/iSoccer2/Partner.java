package iSoccer2;

public class Partner extends Person
{
	String address;
	boolean pay;
	SupportPlans myPlan;
	
	public Partner() {
		super();
		setAddress();
		setPay();
		setMyPlan();

	}

	public String getAdress() {
		return address;
	}

	public void setAddress() {
		Menu.partnerAddress();
		this.address = input.nextLine();
	}

	public boolean isPay() {
		return pay;
	}

	public void setPay() {
		Menu.partnerPay();
		if (input.nextInt()==1) 
			this.pay = true;
		else
			this.pay = false;
		input.nextLine();
	}
	
	public void setMyPlan()
	{
		this.myPlan = myPlan;
	}
	
	public SupportPlans getMyPlan() {
		return myPlan;
	}
	
	
}
