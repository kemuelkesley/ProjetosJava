
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario adm = new FuncAdm("kemuel", 1350);
		adm.bonusPorFuncao("adm");
		
		System.out.println(adm.getSalario());
		
		Funcionario ger = new FuncGerente("Leila", 800);
		ger.bonusPorFuncao("gerente");
		System.out.println("Gerente: " + ger.getNome()+ " R$ " + ger.getSalario());
		
		
		Funcionario vende = new FuncVendedor("Livia", 500);
		vende.bonusPorFuncao("vendedor");
		System.out.println("Vendedor(a): " + vende.getNome()+ " R$ " + vende.getSalario());
		
	}
}
