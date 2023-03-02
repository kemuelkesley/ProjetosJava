import java.util.ArrayList;
import java.util.List;

public class ArrayDinamicos {

	public static void main(String[] args) {
		
		// Array dinamico.
		List<String> names = new ArrayList<>();
		
		// como adicionar elementos no Array.
		
		names.add("nome 1");
		names.add("nome 2");
		names.add("nome 3");
		names.add("nome 4");
		
		// como buscar um elemento especifico pelo indice. get().
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		
		// como buscar o indice a partir de um elemento. 
		int index = names.indexOf("nome 1");
		System.out.println(index);
		
		// mostrar se a lista está vazia ou não usando isEmpty().
		System.out.println(names.isEmpty());
		
		// verificar se a lista contém algum elemento.
		System.out.println(names.contains("nome 10"));
		
		// Tamanho da lista
		System.out.println(names.size());
		
		// Limpar a lista.
		
		names.clear();
		System.out.println(names);
	}

}
