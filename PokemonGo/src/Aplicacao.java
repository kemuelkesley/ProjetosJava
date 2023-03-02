
public class Aplicacao {

	public static void main(String[] args) {
		Pokemon poke = new Pokemon("pikachu", "eletrico", 15);
		
		poke.setForca(78);
		
		String a[] = new String[5];
		a[0] = "cabeçada";
		a[1] = "Chute";
		a[2] = "Joelhada";
		a[3] = "Choque do trovão";
		a[4] = "Raio";
		
		poke.setAtaque(a);
		
		poke.impressaoAtaques();
		
		
		System.out.println("Posicao de ataque: " + poke.posAtaque("Chute"));
	}

}
