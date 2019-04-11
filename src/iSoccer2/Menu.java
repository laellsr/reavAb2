package iSoccer2;

public class Menu{
	
	public static void passwordLogin()
	{
		System.out.printf("senha => projetonota10\n\n");
	}
	
	public static void startLogin()
	{
		System.out.printf("Login: Administrador\nSenha: ");
	}
	
	public static void wrongLogin()
	{
		System.out.printf("\nSenha incorreta, tente novamente.\n\n");
	}
	
	public static void initialMenu()
	{
		System.out.printf("\nBem-vindo ao Gerenciador de Clube iSoccer\n\n"
				+ "[1] Adicionar funcionarios\n"
				+ "[2] Adicionar socios-torcedores\n"
				+ "[3] Alterar estado de pagamento dos socios\n"
				+ "[4] Gerenciar planos\n"
				+ "[5] Gerenciar recursos\n"
				+ "[6] Relatorio sobre o time\n"
				+ "[7] Relatorio sobre os serviços gerais\n"
				+ "[8] Relatorio sobre recursos\n"
				+ "[9] Relatorio sociotorcedor\n"
				+ "[10] Relatorio geral\n"
				+ "[0] Sair\n"
				+ "=> ");
	}
	
	static public void case1Menu()
	{
		System.out.printf("\nSelecione o tipo de funcionario\n"
				+ "[1] Presidente\n"
				+ "[2] Medico\n"
				+ "[3] Tecnico\n"
				+ "[4] Preparador Fisico\n"
				+ "[5] Motorista\n"
				+ "[6] Cozinheiro\n"
				+ "[7] Advogado\n"
				+ "[8] Jogador\n"
				+ "=> ");
	}
	
	static public void personName()
	{
		System.out.printf("\nNome:\n=> ");
	}
	
	static public void personEmail()
	{
		System.out.printf("\nEmail:\n=> ");
	}
	
	static public void personCPF()
	{
		System.out.printf("\nCPF:\n=> ");
	}
	
	static public void personPhone()
	{
		System.out.printf("\nTelefone:\n=> ");
	}
	
	static public void employeeSalary()
	{
		System.out.printf("\nSalario:\n=> ");
	}
	
	static public void doctorCRM()
	{
		System.out.printf("\nCRM:\n=> ");
	}
	
	static public void driverCnh()
	{
		System.out.printf("\nCNH:\n=> ");
	}
	
	static public void playerApto()
	{
		System.out.printf("\n[1] Apto para jogar"
				+ " [0] Departamento Médico\n=> ");
	}
	
	static public void playerType()
	{
		System.out.printf("\n[1]VOLANTE [2]ZAGUEIRO [3]MEIA [4]GOLEIRO\n"
				+ "[5]ATACANTE [6]LATERALESQUERDO [7]LATERALDIREITO\n=> ");
	}
	
	static public void partnerAddress()
	{
		System.out.printf("\nEndereco:\n=> ");
	}
	
	static public void partnerPay()
	{
		System.out.printf("\n[1]Adimplente [0]Inadimplente\n=> ");
	}
	
	static public void partnerPlan()
	{
		System.out.printf("\nPlano: [1]Junior [2]Senior [3]Elite\n=> ");
	}
	
	static public void partnerAd()
	{
		System.out.printf("Status: Adimplente\n");
	}
	
	static public void partnerInad()
	{
		System.out.printf("Status: Inadimplente\n");
	}
	
	static public void nameSearch()
	{
		System.out.printf("\nQuem sera alterado?\n=> ");
	}
	
	static public void resourceSearch()
	{
		System.out.printf("\nQual sera alterado?\n=> ");
	}
	
	static public void notFound()
	{
		System.out.printf("\nNão encontrado!\n");
	}
	
	static public void planMenu()
	{
		System.out.printf("\n[1]Junior - Valor: R$ %.2f\n[2]Senior - Valor: "
				+ "R$ %.2f\n[3]Elite - Valor: R$ %.2f\n[0]Sair\n=> ", 
				Support.getJunior(), Support.getSenior(), Support.getElite());
	}
	
	static public void planNewValue()
	{
		System.out.printf("\nDigite um novo valor:\n=> ");
	}
	
	static public void resourceMenu()
	{
		System.out.printf("\n[1] Adicionar Onibus\n"
				+ "[2] Adicionar Estadio\n"
				+ "[3] Adicionar Centro de Treinamento\n"
				+ "[4] Editar Onibus\n"
				+ "[5] Editar Estadio\n"
				+ "[6] Editar Centro de Treinamento\n"
				+ "\n=> ");
	}
	
	static public void resourceAvaliable()
	{
		System.out.printf("\n[1]Disponivel [2]Indisponivel\n=> ");
	}
	
	static public void resourceIsAvaliable()
	{
		System.out.printf("\nStatus: Disponivel\n=> ");
	}
	
	static public void resourceIsNotAvaliable()
	{
		System.out.printf("\nStatus: Indisponivel\n=> ");
	}
	
	static public void stadiumCapacity()
	{
		System.out.printf("\nCapacidade:\n=> ");
	}
	
	static public void stadiumBathroom()
	{
		System.out.printf("\nQuantidade de banheiros:\n=> ");
	}
	
	static public void stadiumSnackBar()
	{
		System.out.printf("\nQuantidade de lanchonetes:\n=> ");
	}
	
	static public void centerBedroom()
	{
		System.out.printf("\nQuantidade de dormitorios:\n=> ");
	}
	
	static public void playerIsApto()
	{
		System.out.printf("\nStatus: Apto\n=> ");
	}
	
	static public void playerIsNotApto()
	{
		System.out.printf("\nStatus: Departameno Medico\n=> ");
	}
}
