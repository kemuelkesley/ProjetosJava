
public class FuncGerente extends Funcionario{

	public FuncGerente(String nome, double salario) {
		super(nome, salario);		
	}

	@Override
	public double calculoPorcentagem() {
		double porcentagem = (this.salario = this.salario * 10)/100;
		return porcentagem;
	}
	
	@Override
	public void bonusPorFuncao(String funcao) {			
		if(funcao == "gerente") {
			this.salario += calculoPorcentagem();			
		}
		else {
			if(funcao != null ) {
				System.err.println("Função: " + funcao + " Não existe");
			}
		}
	}
		
	
}
