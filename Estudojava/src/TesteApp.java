import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class TesteApp {

	public static void main(String[] args) {
		
		ArrayList<Cliente> cliente = new ArrayList<>();
		
		cliente.add(new Cliente("Carlos", 19));
		cliente.add(new Cliente("jairo", 54));
				
		System.out.println("Tamanho do Array: "+ cliente.size());
		
		int indice = 0;
		for(Cliente clientes : cliente) {
			indice++;
			System.out.println(indice+ " - " + " Nome: " + clientes.getNome() + " Idade: " + clientes.getIdade());
		
			
		}
		
		
	}

}
