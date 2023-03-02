
public class Teste {

	public static void main(String[] args) {
		
		Funcionario funcionarioTi = new Funcionario();
		Gerente gerenteTi = new Gerente();
		
		funcionarioTi.setNome("kemuel");
		funcionarioTi.setSalario(1400);
		gerenteTi.setSalario(3000);
		
		System.out.println(funcionarioTi.getNome());
		System.out.println(funcionarioTi.getSalario());
		System.out.println(gerenteTi.getSalario());

		
		System.out.println(funcionarioTi.getBonificacao());
	}

}
