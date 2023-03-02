
public class TestaPessoa {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("kemuel", 20);
		System.out.println(pessoa.nome);
		System.out.println(pessoa.idade);
		
		pessoa.mensagem();
		
	}
}
