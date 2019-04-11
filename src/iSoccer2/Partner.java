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

	@Override
	public void isPay() {
		if (this.pay)
			Menu.partnerAd();
		else
			Menu.partnerInad();
	}

	public void setPay() {
		Menu.partnerPay();
		if (input.nextInt()==1) 
			this.pay = true;
		else
			this.pay = false;
		input.nextLine();
	}
	
	public void setMyPlan(){
		Menu.partnerPlan();
		switch (input.nextInt()) {
		case 1:
			this.myPlan = SupportPlans.JUNIOR;
			break;
		case 2:
			this.myPlan = SupportPlans.SENIOR;
			break;
		case 3:
			this.myPlan = SupportPlans.ELITE;
			break;
		default:
			break;
		}
		
		input.nextLine();
	}
	
	public SupportPlans getMyPlan() {
		return myPlan;
	}
	
	
}
