package iSoccer2;

public class TrainingCenter extends Resource{
	
	protected int bedrooms;
	
	public TrainingCenter() {
		super();
		setBedrooms();
	}

	public int getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms() {
		Menu.centerBedroom();
		this.bedrooms = input.nextInt(); input.nextLine();
	}
	
	
}
