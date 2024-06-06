import java.util.Scanner;

public class Exercicio6 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int number;
		int multipleofThreeCount = 0;
		int multipleofThreeSum = 0;

		do {
			System.out.println("Digite um número:");
			number = userInput.nextInt();
			
			if (number != 0 && number % 3 == 0) {
				System.out.println("O número " + number + "é multiplo de 3!");
				multipleofThreeCount++;
				multipleofThreeSum += number;
			}
			
		} while (number != 0);
		
		System.out.printf("A média de todos os números múltiplos de 3 é: %.2f %n", 
				((float)multipleofThreeSum / multipleofThreeCount));
			
		userInput.close();
	}
}