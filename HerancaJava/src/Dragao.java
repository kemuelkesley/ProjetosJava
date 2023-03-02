
public class Dragao extends Ave {

	public Dragao(String nome) {
		super(nome);
	}
	
	public void soltarFogo() {
		System.out.printf("%s Soltou uma bola de fogo\n", getNome());
	}
	
	public void voar() {
		System.out.printf("%s voou\n", getNome());
	}
	
}
