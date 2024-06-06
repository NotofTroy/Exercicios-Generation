import java.util.Scanner;

public class Exercicio5 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int number;
		int totalSum = 0;

		do {
			System.out.println("Digite um número:");
			number = userInput.nextInt();
			
			if (number > 0) {
				totalSum += number;
			}
			
		} while (number != 0);
		
		System.out.println("A soma dos números positivos é: " + totalSum);
			
		userInput.close();
	}
}