package iSoccer2;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		
		String password = "vazio";
		Scanner input = new Scanner(System.in);
		Menu.passwordLogin();
	
		while(password.intern()!="projetonota10") {
			Menu.startLogin();
			password = input.nextLine();
			if(password.intern()!="projetonota10")
				Menu.wrongLogin();
		}
		
		input.close();
	}
}
