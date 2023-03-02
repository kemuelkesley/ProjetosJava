
public class Animal {
	private String nome;
	
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	// metodos
	public void comer() {
		System.out.printf("%s comeu\n", nome);
	}
	
	public void beber() {
		System.out.printf("%s bebeu\n", nome);
	}

	// getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
}
