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
		System.out.printf("Bem-vindo ao Gerenciador de Clube iSoccer\n"
				+ "[1] Adicionar funcionarios\n"
				+ "[2] Adicionar socios-torcedores\n"
				+ "[3] Editar valor dos planos\n"
				+ "[4] Gerenciar recursos\n"
				+ "[5] Relatorio sobre funcionarios\n"
				+ "[6] Relatorio sobre socios-torcedores\n"
				+ "[7] Relatorio sobre recursos\n"
				+ "[8] Relatorio completo\n"
				+ "[0] Sair\n"
				+ "=> ");
	}
	
	
}
