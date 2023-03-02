import java.util.ArrayList;
import java.util.List;

public class Estudando {

	public static void main(String[] args) {
		//calcularNumeros(3, 6);
		
		//MostrarListaDeContatos();
		mostrarNomeTelefone("Carlos","82988516305");
		mostrarNomeTelefone("Leila", "82 98728-3025");
		mostrarNomeTelefone("Livia", "82 98730-4050");
		mostrarNomeTelefone(null, null);
		
		
		
	}

	public static void calcularNumeros(int numero1, int numero2) {
		int resultado = numero1 - numero2;
		
		if (resultado < 0) {
			System.out.println("valor do resultado negativo");
		}else {
			System.out.printf("%d + %d = %d \n", numero1, numero2, (numero1 + numero2));
			System.out.printf("%d - %d = %d\n", numero1, numero2, (resultado));
			System.out.printf("%d * %d = %d\n", numero1, numero2, (numero1 * numero2));
			System.out.printf("%d / %d = %d\n", numero1, numero2, (numero1 / numero2));
		}
	}

	
	public static void MostrarListaDeContatos() {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("kemuel");
		nomes.add("leila");
		
		int contador = 0;
		for (int i = 0; i < nomes.size(); i++) {
			contador++;
			System.out.println(contador+" - Contato: "+ nomes.get(i));
		}
	}
	
	
	
	public static void mostrarNomeTelefone(String nome, String telefone) {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Nome: " + nome + " Telefone: "+ telefone);
		for (int i = 0; i < nomes.size(); i++) {			
			System.out.println(nomes.get(i));
		}
		
	}
	

}
