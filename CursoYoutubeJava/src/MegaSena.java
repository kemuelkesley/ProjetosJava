import java.util.Random;

public class MegaSena {

	public static void main(String[] args) {
		
				
		Random generate = new Random();
		
		
		// while(true) => looping infinito
//		int i = 0;
//		while (i < 6) {
//			int number = generate.nextInt(10);
//			System.out.println(number);
//			i++;
//		}
//		
//	for(int i = 0; i < 6; i++) {
//		int number = generate.nextInt(60);
//		System.out.println(number);
//	}	

	
	
	while(true) {
		int numero = generate.nextInt(100);
		System.out.println(numero);
		
		if(numero == 33) {
			System.out.println("Número encontrado = " + numero);
			break;
		}
	}
	
		
	}

}
