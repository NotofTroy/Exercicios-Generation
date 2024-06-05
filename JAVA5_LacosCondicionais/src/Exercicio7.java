import java.util.Scanner;

public class Exercicio7 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		float firstNumber, secondNumber;
		int operationCode;
		
		System.out.println("Digite o 1º número:");
		firstNumber = userInput.nextFloat();
		
		System.out.println("Digite o 2º número:");
		secondNumber = userInput.nextFloat();
		
		System.out.println("Operação:");
		operationCode = userInput.nextInt();
		
		switch (operationCode) {
		case 1:
			System.out.printf("%.2f + %.2f = %.2f", firstNumber, secondNumber, (firstNumber + secondNumber));
			break;
		case 2:
			System.out.printf("%.2f - %.2f = %.2f", firstNumber, secondNumber, (firstNumber - secondNumber));
			break;
		case 3:
			System.out.printf("%.2f * %.2f = %.2f", firstNumber, secondNumber, (firstNumber * secondNumber));
			break;
		case 4:
			System.out.printf("%.2f / %.2f = %.2f", firstNumber, secondNumber, (firstNumber / secondNumber));
			break;
		default:
			System.out.printf("Operação Inválida!");	
		}

		userInput.close();
	}
}