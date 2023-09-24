package desafioIPhone;

public class NavegadorInternet implements NavegadorInternetInterface {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina!");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionado nova aba!");
		
	}

	@Override
	public void atualizaPagina() {
		System.out.println("Atualicando pagina!");
		
	}	
}
