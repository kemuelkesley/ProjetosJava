
public  class Funcionario {
	private String nome;
	protected double salario;
	
	
	// Construtor
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;		
	}
		

	
	public double calculoPorcentagem() {
		double porcentagem = (this.salario = this.salario * 0.1/100);
		return porcentagem;
	}
	
	
	// Bonus de salario.
	public void bonusPorFuncao(String funcao) {			
		if(funcao == "adm") {
			this.salario += calculoPorcentagem();			
		}
		else {
			if(funcao != null ) {
				System.err.println("Função: " + funcao + " Não existe");
			}
		}
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}




	
	
	
}
