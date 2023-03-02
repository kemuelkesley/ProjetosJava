import java.util.Random;

public class CriandoNomes {

	public static void main(String[] args) {
				
		Random generate = new Random();
//		
//		String[] nomes =  {"João", "Maria", "José", "Ana", "Carlos", "kemuel", "kesliane", "leila", "Livia"};
//		
//		int gerarNomeAleatorio = generate.nextInt(nomes.length);
//		String nomesAleatorios = nomes[gerarNomeAleatorio];
//		
//		System.out.println("Nome Aleatorio: "+ nomesAleatorios);
//		
		// Executa nomes aleatorios em 1 em 1 segundo.
		while (true) {
			String[] nomes =  {"João", "Maria", "José", "Ana", "Carlos", "kemuel", "kesliane", "leila", "Livia"};
			int gerarNomeAleatorio = generate.nextInt(nomes.length);
			String nomesAleatorios = nomes[gerarNomeAleatorio];
			System.out.println("Nome Aleatorio: "+ nomesAleatorios);
			
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
		

}
