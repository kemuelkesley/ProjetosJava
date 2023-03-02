
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario();
		func1.setNome("kemuel");
		func1.setIdade(20);
		
		System.out.println(func1.getNome());
		System.out.println(func1.getIdade());
		
		func1.mostrarNomeIdade();
		
		Gerente gere = new Gerente();
		gere.setNome("Aline");
		gere.setIdade(35);
		
		gere.mostrarNomeIdade();
		
		
		func1.setSalario(500);
		func1.bonusParaFuncionario();
		System.out.println(func1.getSalario());
		
		
		gere.setSalario(1000);
		gere.bonusParaFuncionario();
		System.out.println(gere.getSalario());
		
		
		

	}

}
