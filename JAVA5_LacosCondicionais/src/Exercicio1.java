import java.util.Scanner;

public class Exercicio1 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int firstNumber, secondNumber, thirdNumber;
		
		System.out.println("Digite o número A: ");
		firstNumber = userInput.nextInt();
		
		System.out.println("Digite o número B: ");
		secondNumber = userInput.nextInt();
		
		System.out.println("Digite o número C: ");
		thirdNumber = userInput.nextInt();
		
		if (firstNumber + secondNumber > thirdNumber) {
			System.out.println("A Soma de A + B é Maior do que C");
		} else if (firstNumber + secondNumber < thirdNumber) {
			System.out.println("A Soma de A + B é Menor do que C");
		} else {
			System.out.println("A Soma de A + B é Igual a C");
		}
		
		userInput.close();
	}
}