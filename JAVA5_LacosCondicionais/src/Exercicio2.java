import java.util.Scanner;

public class Exercicio2 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int number;
		
		System.out.println("Digite o número a ser analisado: ");
		number = userInput.nextInt();
		
		if (number % 2 == 0) {
			if (number == 0) {
				System.out.println("O Número " + number + " é par e é neutro!");
			} else if (number > 0) {
				System.out.println("O Número " + number + " é par e é positivo!");
			} else {
				System.out.println("O Número " + number + " é par e é negativo!");
			}	
		} else {
			if (number > 0) {
				System.out.println("O Número " + number + " é ímpar e é positivo!");
			} else {
				System.out.println("O Número " + number + " é ímpar e é negativo!");
			}
		}
		
		userInput.close();
	}
}