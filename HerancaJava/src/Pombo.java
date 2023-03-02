
public class Pombo extends Ave {

	private int cartaEnviada;
	
	public Pombo(String nome) {
		super(nome);
		this.cartaEnviada = 10;
	}
	
	
	
	public void voar() {
		System.out.printf("%s voaou\n", getNome());
	}
	
	public void fazerPruch() {
		System.out.printf("%s Fez Pruuuuuuuu\n", getNome());
	}
	
	public void enviarCarta() {
		System.out.printf("%s enviou uma carta\n", getNome());
		cartaEnviada++;
	}
	
	public int getCartaEnviada() {
		return cartaEnviada;
	}
	
	
	
	
	
}
