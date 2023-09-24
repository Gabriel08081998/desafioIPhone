package desafioIPhone;

public class AparelhoTelefonico implements AparelhoTelefonicoInterface {

	@Override
	public void ligar() {
		System.out.println("Ligado!");
		
	}

	@Override
	public void atender() {
		System.out.println("Ligaçao atendida!");
		
	}

	@Override
	public void iniciarCoreiovoz() {
		System.out.println("Coreio de voz iniciado!");
		
	}


}



