import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TesteArrays {
	
	// Wrapper class 
//	tipo primitivo   > Whapper class
//	int			     > Interger	
//	float			 > Float	
//	double           > Double
//	char             > Character  
	
	
	public static void main(String[] args) {
		
		ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
		
		pessoa.add(new Pessoa("kemuel", 20));
		pessoa.add(new Pessoa("Leila", 32));
		pessoa.add(new Pessoa("Livia", 14));
		
		int indice = 0;
		for(Pessoa pessoas : pessoa) {
			indice++;
			System.out.println(indice + " - " + pessoas.getNome());
		}

		
		
		
		
	}
	
}
