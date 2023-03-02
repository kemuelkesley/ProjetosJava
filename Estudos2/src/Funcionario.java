
public class Funcionario {
	private String nome;
	private int idade;
	private String nomeCompleto;
	private double salario;
	
	
	public void bonusParaFuncionario() {
		this.salario += 50;
	}
	

	public void mostrarNomeIdade() {
		this.nomeCompleto = ("Nome: "+ this.nome + " Idade: " + this.idade + " anos");
		System.out.println(nomeCompleto);
	}
	
	
	
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
}
