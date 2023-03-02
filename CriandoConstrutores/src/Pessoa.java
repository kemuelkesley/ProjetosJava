	
public class Pessoa {
	String nome;
	int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void mensagem() {
		String msg = this.nome + " esse é o seu nome?";
		System.out.println(msg);
		String falarIdade = "Você tem " + this.idade+ " Anos" + "?";
		System.out.println(falarIdade);
	}
}
