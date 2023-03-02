import java.util.Arrays;

public class TiposDeArrays2 {

	public static void main(String[] args) {
		String[] names = new String[10];
		System.out.println(Arrays.toString(names));
		
		Arrays.fill(names, "Desconhecido");
		
		System.out.println(setarMensagemArray(names, "nada"));
			
		
	}
	
	static public String setarMensagemArray(String[] nomeArray, String nome) {
		Arrays.fill(nomeArray, nome);				
		String mostrarArray = Arrays.toString(nomeArray);
				
		return mostrarArray;
	}
}
