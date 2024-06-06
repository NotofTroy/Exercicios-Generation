import java.util.Scanner;

public class Exercicio2 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int number;
		int evenNumberCount = 0, oddNumberCount = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "º" + " número:");
			number = userInput.nextInt();
			
			if (number % 2 == 0) {
				evenNumberCount++;
			} else {
				oddNumberCount++;
			}
		}
		
		System.out.println("Total de números pares: " + evenNumberCount);
		System.out.println("Total de números ímpares: " + oddNumberCount);
		
		userInput.close();
	}
}