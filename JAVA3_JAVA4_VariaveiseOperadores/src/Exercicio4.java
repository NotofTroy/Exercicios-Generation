import java.util.Scanner;

public class Exercicio4 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		float firstNumber, secondNumber, thirdNumber, fourthNumber, differenceResult;
		
		System.out.println("Digite o número 1: ");
		firstNumber = userInput.nextFloat();
		
		System.out.println("Digite o número 2: ");
		secondNumber = userInput.nextFloat();
		
		System.out.println("Digite o número 3: ");
		thirdNumber = userInput.nextFloat();
		
		System.out.println("Digite o número 4: ");
		fourthNumber = userInput.nextFloat();
		
		differenceResult = (firstNumber * secondNumber) - (thirdNumber * fourthNumber);
		
		System.out.printf("A diferença é %.2f %n: ", differenceResult );
		
		userInput.close();
	}
}