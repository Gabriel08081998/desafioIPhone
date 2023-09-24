package desafioIPhone;

public class IPhone {

	NavegadorInternet internet;
	
	ReprodutorMusical musical;
	
	AparelhoTelefonico aparelhoTelefonico;
	
	public static void main(String[] args) {
		IPhone iPhone = new IPhone();
		iPhone.internet = new NavegadorInternet();
		iPhone.internet.exibirPagina();
		iPhone.internet.adicionarNovaAba();
		iPhone.internet.atualizaPagina();
		
		System.out.println("");
		
		iPhone.musical = new ReprodutorMusical();
		iPhone.musical.tocar();
		iPhone.musical.pausar();
		iPhone.musical.selecionarMusica();
		
		System.out.println("");
		
		iPhone.aparelhoTelefonico = new AparelhoTelefonico();
		iPhone.aparelhoTelefonico.ligar();
		iPhone.aparelhoTelefonico.atender();
		iPhone.aparelhoTelefonico.iniciarCoreiovoz();
		
		
	}
	
}
