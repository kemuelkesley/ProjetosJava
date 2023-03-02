
public class FuncVendedor extends Funcionario {
	
	public FuncVendedor(String nome, double salario) {
		super(nome,salario);
	}
	
	@Override
	public double calculoPorcentagem() {
		double porcentagem = (this.salario = this.salario * 20)/100;
		return porcentagem;
	}
	
	@Override
	public void bonusPorFuncao(String funcao) {			
		if(funcao == "vendedor") {
			this.salario += calculoPorcentagem();			
		}
		else {
			if(funcao != null ) {
				System.err.println("Função: " + funcao + " Não existe");
			}
		}
	}
	
}
