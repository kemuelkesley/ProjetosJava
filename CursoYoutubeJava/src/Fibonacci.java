import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[]{10,30,3,2,1,10};
			
		
		String[] nomes = new String[] {"carlos", "aline", "kemuel", "jairo"};
		
		Arrays.sort(numbers);
		System.out.println(numbers);
		
		System.out.println(Arrays.toString(numbers));
		
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			
		}
		
				
//					
//		Arrays.sort(nomes);
//		System.out.println(Arrays.toString(nomes));
		
		
		
	}


}
