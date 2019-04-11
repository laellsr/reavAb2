package iSoccer2;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		
		ArrayList<Person> persons = new ArrayList<Person>();
		ArrayList<Resource> resources = new ArrayList<Resource>();
		Scanner input = new Scanner(System.in);
		String password = "null";
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
					Partner newPartner = new Partner();
					persons.add(newPartner);
					break;
					
				case 3:
					showPartners(persons);
					Menu.nameSearch();
					String name = input.nextLine();
					name = name.toUpperCase();
					Partner loadPartner = (Partner)searchPerson(persons, name);
					if (loadPartner != null)
						loadPartner.setPay();
					break;
					
				case 4:
					Menu.planMenu();
					decision = input.nextInt(); input.nextLine();
					if (decision==0||decision>3)
						break;
					double newValue = input.nextDouble(); input.nextLine();						
					switch (decision) {
						case 1:
							Support.setJunior(newValue);
							break;
						case 2:
							Support.setSenior(newValue);
							break;
						case 3:
							Support.setElite(newValue);
							break;
						default:
							break;
						}
					break;
					
				case 5:
					Menu.resourceMenu();
					decision = input.nextInt(); input.nextLine();
					switch (decision) {
						case 1:
							Bus newBus = new Bus();
							resources.add(newBus);
							break;
						case 2:
							Stadium newStadium = new Stadium();
							resources.add(newStadium);
							break;
						case 3:
							TrainingCenter newCenter = new TrainingCenter();
							resources.add(newCenter);
							break;
						case 4:
							showBus(resources);
							Menu.resourceSearch();
							name = input.nextLine();
							name = name.toUpperCase();
							Bus loadBus = (Bus)searchResource(resources, name);
							if(loadBus!=null)
								loadBus.setAvailable();
							break;
						case 5:
							showStadium(resources);
							Menu.resourceSearch();
							name = input.nextLine();
							name = name.toUpperCase();
							Stadium loadStadium = (Stadium)searchResource(resources, name);
							if (loadStadium==null)
								break;
							loadStadium.setAvailable();
							loadStadium.setBathrooms();
							loadStadium.setSnackBars();
							loadStadium.setSupporters();
							break;
						case 6:
							showCenter(resources);
							Menu.resourceSearch();
							name = input.nextLine();
							name = name.toUpperCase();
							TrainingCenter loadCenter = (TrainingCenter)searchResource(resources, name);
							if(loadCenter==null)
								break;
							loadCenter.setAvailable();
							loadCenter.setBedrooms();
						default:
							break;
						}
					break;
					
				case 6:
					showCoach(persons);
					showPlayer(persons);
					break;
				
				case 7:
					showEmployees(persons);
					break;
				
				case 8:
					showBus(resources);
					showStadium(resources);
					showCenter(resources);
					break;
				
				case 9:
					partnersReport(persons);
					break;
				
				case 10:
					showCoach(persons);
					showPlayer(persons);
					showEmployees(persons);
					showBus(resources);
					showStadium(resources);
					showCenter(resources);
					partnersReport(persons);
					break;
					
				case 0:
					active = false;
					break;
					
				default:
					break;
				
			}
		}
		
		input.close();
	}
	
	public static Person searchPerson(ArrayList<Person> persons, String name)
	{
		PersonIterator iterator = new PersonIterator(persons);
		while(iterator.hasNext()) {
			Person person = (Person)iterator.next();
			if (person.getName().intern()==name.intern()){
				return person;
			}
		}
		Menu.notFound();
		return null;
	}
	
	public static Resource searchResource(ArrayList<Resource> resources, String name)
	{
		ResourceIterator iterator = new ResourceIterator(resources);
		while(iterator.hasNext()) {
			Resource resource = (Resource)iterator.next();
			if (resource.getName().intern()==name.intern()){
				return resource;
			}
		}
		Menu.notFound();
		return null;
	}

	public static void showPartners(ArrayList<Person> persons)
	{
		PersonIterator iterator = new PersonIterator(persons);
		while(iterator.hasNext()) {
			Person person = (Person)iterator.next();
			if (person.getClass().getSimpleName().intern()=="Partner"){
				System.out.println(person.name);
				person.isPay();
			}
		}
	}
	
	public static void showBus(ArrayList<Resource> resources)
	{
		ResourceIterator iterator = new ResourceIterator(resources);
		while(iterator.hasNext()) {
			Resource resource = (Resource)iterator.next();
			if (resource.getClass().getSimpleName().intern()=="Bus"){
				System.out.println(resource.name);
				resource.isAvailable();
			}
		}
	}
	
	public static void showStadium(ArrayList<Resource> resources)
	{
		ResourceIterator iterator = new ResourceIterator(resources);
		while(iterator.hasNext()) {
			Resource resource = (Resource)iterator.next();
			if (resource.getClass().getSimpleName().intern()=="Stadium"){
				System.out.println(resource.name);
				resource.isAvailable();
			}
		}
	}
	
	public static void showCenter(ArrayList<Resource> resources)
	{
		ResourceIterator iterator = new ResourceIterator(resources);
		while(iterator.hasNext()) {
			Resource resource = (Resource)iterator.next();
			if (resource.getClass().getSimpleName().intern()=="TrainingCenter"){
				System.out.println(resource.name);
				resource.isAvailable();
			}
		}
	}
	
	public static void showCoach(ArrayList<Person> persons)
	{
		PersonIterator iterator = new PersonIterator(persons);
		while(iterator.hasNext()) {
			Person person = (Person)iterator.next();
			if (person.getClass().getSimpleName().intern()=="Coach"){
				System.out.printf("Tecnico: %s\nCPF: %s\nEmail: %s\n\n", person.name, person.CPF, person.email);
			}
		}
	}
	
	public static void showPlayer(ArrayList<Person> persons)
	{
		PersonIterator iterator = new PersonIterator(persons);
		Player loadPlayer;
		while(iterator.hasNext()) {
			Person person = (Person)iterator.next();
			if (person.getClass().getSimpleName().intern()=="Player"){
				loadPlayer = (Player)person;
				System.out.printf("Jogador: %s\n"
						+ "Posicao: %s\n", person.name, loadPlayer.getType());
				loadPlayer.isApto();
			}
		}
	}
	
	public static void showEmployees(ArrayList<Person> persons)
	{
		PersonIterator iterator = new PersonIterator(persons);
		Employee loadEmployee;
		Doctor loadDoctor;
		Driver loadDriver;
		while(iterator.hasNext()) {
			Person person = (Person)iterator.next();
			loadEmployee = (Employee)person;
			if (	person.getClass().getSimpleName().intern()=="Cooker"
					||person.getClass().getSimpleName().intern()=="Lawyer"
					||person.getClass().getSimpleName().intern()=="President"
					||person.getClass().getSimpleName().intern()=="Trainer"){
		
				System.out.printf("Nome: %s\nCPF: %s\nFuncao: %s\nSalario: R$ %.2f\n",
						person.getName(), person.getCPF(), person.getClass().getSimpleName(),
						loadEmployee.salary);
			}
			else if (person.getClass().getSimpleName().intern()=="Doctor") {
				loadDoctor = (Doctor)person;
				System.out.printf("Nome: %s\nCPF: %s\nFuncao: %s CRM: %s\nSalario: R$ %.2f\n",
						person.getName(), person.getCPF(), person.getClass().getSimpleName(),
						loadDoctor.CRM, loadEmployee.salary);
			}
			else if (person.getClass().getSimpleName().intern()=="Driver") {
				loadDriver = (Driver)person;
				System.out.printf("Nome: %s\nCPF: %s\nFuncao: %s CNH: %s\nSalario: R$ %.2f\n",
						person.getName(), person.getCPF(), person.getClass().getSimpleName(),
						loadDriver.cnhNumber, loadEmployee.salary);
			}
		}
	}
	
	public static void partnersReport(ArrayList<Person> persons)
	{
		PersonIterator iterator = new PersonIterator(persons);
		Partner loadPartner;
		int counter=0;
		while(iterator.hasNext()) {
			Person person = (Person)iterator.next();
			if (person.getClass().getSimpleName().intern()=="Partner") {
				counter++;
			}
		}

		System.out.printf("\n## Relatorio de SocioTorcedores ##\n\n"
				+ "Quantidade de sociotorcedores: %d\n\n", counter);
		
		iterator.resetIndex();
		while(iterator.hasNext()) {
			Person person = (Person)iterator.next();
			if (person.getClass().getSimpleName().intern()=="Partner"){
				loadPartner = (Partner)person;
				if (loadPartner.pay) {
				System.out.printf("%s - Adimplente\n", loadPartner.name);
				}
			}
		}
		
		iterator.resetIndex();
		while(iterator.hasNext()) {
			Person person = (Person)iterator.next();
			if (person.getClass().getSimpleName().intern()=="Partner"){
				loadPartner = (Partner)person;
				if (!loadPartner.pay) {
				System.out.printf("%s - Inadimplente\n", loadPartner.name);
				}
			}
		}
		
		iterator.resetIndex();
		while(iterator.hasNext()) {
			Person person = (Person)iterator.next();
			if (person.getClass().getSimpleName().intern()=="Partner"){
				loadPartner = (Partner)person;
				if (!loadPartner.pay) {
				System.out.printf("Nome: %s CPF: %s\n"
						+ "Endereco: % Telefone: %s\n"
						+ "Plano: %s\n", loadPartner.name, loadPartner.CPF,
						loadPartner.address, loadPartner.phone, loadPartner.myPlan);
				}
			}
		}
	}
	
}