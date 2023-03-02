// Não pode mais instanciar essa classe porque ela é abstrata.
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	
	// Metodo sem Corpo, não há implementação, não pode dá new.
	public abstract double getBonificacao();
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
