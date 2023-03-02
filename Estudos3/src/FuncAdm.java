
public  class FuncAdm extends Funcionario {
	
	public FuncAdm(String nome, double salario) {
		super(nome, salario);		
	}
	
		
	public double calculoPorcentagem() {
		double porcentagem = (this.salario = this.salario * 5)/100;
		return porcentagem;
	}
	
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


	
	
}
