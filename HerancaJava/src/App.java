
public class App {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Lua");
		cachorro.setNome("Caramelo");
		cachorro.latir();
		cachorro.comer();
		
		
		Gato gato = new Gato("Snowbell");
		gato.miar();
		
		Dragao dragao = new Dragao("Dragão branco");
		dragao.soltarFogo();
		
		
		Pombo pombo = new Pombo("Pombo Correio sedex");
		pombo.fazerPruch();
		
	}

}
