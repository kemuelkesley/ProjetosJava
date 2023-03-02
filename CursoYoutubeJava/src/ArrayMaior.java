import java.util.Random;

public class ArrayMaior {

	public static void main(String[] args) {
		
		int[] numeros = new int[5];
		
		Random gerador = new Random();
		
		//preencher com números aleatorios.
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = gerador.nextInt(20);
			
		}
		
		//inicializar a variavel maior com o primeiro número do array.
		
		int maior = numeros[0];
		
		 // Verifica qual número é maior
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        
        // Imprime o número maior
        System.out.println("O número maior é: " + maior);
    }

	

}
