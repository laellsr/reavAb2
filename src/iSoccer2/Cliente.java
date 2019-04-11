package iSoccer2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		
		ArrayList<Person> persons = new ArrayList<Person>();
		
		String password = "null";
		Scanner input = new Scanner(System.in);
		Menu.passwordLogin();
	
		while(password.intern()!="projetonota10") {
			Menu.startLogin();
			password = input.nextLine();
			if(password.intern()!="projetonota10")
				Menu.wrongLogin();
		}
		
		boolean active = true;
		while(active) {
			Menu.initialMenu();
			int decision = input.nextInt(); input.nextLine();
			switch (decision) {
				case 1:
					Menu.case1Menu();
					decision = input.nextInt(); input.nextLine();
					switch (decision) {
						case 1:
							President newPresident = new President();
							persons.add(newPresident);
							break;
						case 2:
							Doctor newDoctor = new Doctor();
							persons.add(newDoctor);
							break;
						case 3:
							Coach newCoach = new Coach();
							persons.add(newCoach);
							break;
						case 4:
							Trainer newTrainer = new Trainer();
							persons.add(newTrainer);
							break;
						case 5:
							Driver newDriver = new Driver();
							persons.add(newDriver);
							break;
						case 6:
							Cooker newCooker = new Cooker();
							persons.add(newCooker);
							break;
						case 7:
							Lawyer newLawyer = new Lawyer();
							persons.add(newLawyer);
							break;
						case 8:
							Player newPlayer = new Player();
							persons.add(newPlayer);
							break;
						default:
							break;
					}
					break;
					
				case 2:
					
					
				case 0:
					active = false;
					break;
					
				default:
					break;
				
			}
		}
		
		input.close();
	}
	
	public static void addEmployee()
	{
		
	}
}
