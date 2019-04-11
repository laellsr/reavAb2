package iSoccer2;

public class Stadium extends Resource{
	
	protected int supporters, bathrooms, snackBars;
	
	public Stadium() {
		super();
		setSupporters(); setBathrooms(); setSnackBars();
	}

	public int getSupporters() {
		return supporters;
	}

	public void setSupporters() {
		Menu.stadiumCapacity();
		this.supporters = input.nextInt(); input.nextLine();
	}

	public int getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms() {
		Menu.stadiumBathroom();
		this.bathrooms = input.nextInt(); input.nextLine();
	}

	public int getSnackBars() {
		return snackBars;
	}

	public void setSnackBars() {
		Menu.stadiumSnackBar();
		this.snackBars = input.nextInt(); input.nextLine();
	}
	
	
}
