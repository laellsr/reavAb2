package iSoccer2;

public class Player extends Employee
{
	public enum playerFunction
	{
		VOLANTE, ZAGUEIRO, MEIA, GOLEIRO, ATACANTE, LATERALESQUERDO, LATERALDIREITO;
	}

	boolean apto;
	public playerFunction type;
	
	public Player() {
		super();
		setType();
		setApto();
	}

	public boolean isApto() {
		return apto;
	}

	public void setApto() {
		Menu.playerApto();
		if (input.nextInt()==1) 
			this.apto = true;
		else
			this.apto = false;
		input.nextLine();
	}

	public playerFunction getType() {
		return type;
	}

	public void setType() {
		Menu.playerType();
		switch (input.nextInt()) {
		case 1:
			this.type = playerFunction.VOLANTE;
			break;
		case 2:
			this.type = playerFunction.ZAGUEIRO;
			break;
		case 3:
			this.type = playerFunction.MEIA;
			break;
		case 4:
			this.type = playerFunction.GOLEIRO;
			break;
		case 5:
			this.type = playerFunction.ATACANTE;
			break;
		case 6:
			this.type = playerFunction.LATERALESQUERDO;
			break;
		case 7:
			this.type = playerFunction.LATERALDIREITO;
			break;
		}
		input.nextLine();
	}
	
	
	
}
