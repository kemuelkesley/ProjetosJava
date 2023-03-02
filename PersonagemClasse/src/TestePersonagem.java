
public class TestePersonagem {

	public static void main(String[] args) {
		
		Guerreiro guerreiro = new Guerreiro("kemdark", 10, 20);
		guerreiro.criarClasse("guerreiro");
		
		Guerreiro guerreiro2 = new Guerreiro("Leila", 5, 30);
		guerreiro2.criarClasse("guerreiro");

		guerreiro.atacar(1);
		
	}

}
