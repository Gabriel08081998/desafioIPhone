package desafioIPhone;

public class ReprodutorMusical implements ReprodutorMusicalInterface {

	@Override
	public void tocar() {
		System.out.println("Tocando!");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausado!");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Musica selecionado!");
		
	}
	
	

}

