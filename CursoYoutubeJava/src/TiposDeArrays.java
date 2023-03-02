import java.util.Arrays;

public class TiposDeArrays {

	public static void main(String[] args) {
		
		int[] numbersA = new int[] {1,2,3};
		int[] numbersB = new int[] {1,2,3};
		
		
		System.out.println(numbersA == numbersB);
		System.out.println(numbersA.equals(numbersB));
		//pega o conteudo do numberA e compara com o conteúdo do numberB.
		System.out.println(Arrays.equals(numbersA, numbersB));
		
		
	}

}
