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
				+ "[4] Editar valor dos planos\n"
				+ "[5] Gerenciar recursos\n"
				+ "[6] Relatorio sobre funcionarios\n"
				+ "[7] Relatorio sobre socios-torcedores\n"
				+ "[8] Relatorio sobre recursos\n"
				+ "[9] Relatorio completo\n"
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
}
