import java.util.Scanner;

public class Exercicio1 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int firstNumber, secondNumber;
		
		System.out.println("Digite o primeiro número do intervalo:");
		firstNumber = userInput.nextInt();
		
		System.out.println("Digite o último número do intervalo:");
		secondNumber = userInput.nextInt();
		
		if (firstNumber >= secondNumber) {
			System.out.println("Intervalo inválido!");
		} else {
			for (int i = firstNumber; i <= secondNumber; i++) {
				if (i != 0 && i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		}
		
		userInput.close();
	}
}