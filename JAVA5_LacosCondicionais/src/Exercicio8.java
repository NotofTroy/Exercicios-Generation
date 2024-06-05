import java.util.Scanner;

public class Exercicio8 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int operationCode;
		float accountBalance = 1000.00f;
		float operationValue;
		
		System.out.println("Operação:");
		operationCode = userInput.nextInt();
		
		switch (operationCode) {
		case 1:
			System.out.printf("Operação - Saldo %nSaldo: %.2f %n", accountBalance);
			break;
			
		case 2:
			System.out.println("Valor:");
			operationValue = userInput.nextFloat();
			
			System.out.println("Operação - Saque");
			
			if (operationValue > accountBalance) {
				System.out.println("Saldo Insuficiente!");
			} else {
				accountBalance -= operationValue;
				System.out.printf("Novo Saldo: R$ %.2f", accountBalance);
			}
 			break;
 			
		case 3:
			System.out.println("Valor:");
			operationValue = userInput.nextFloat();
			accountBalance += operationValue;
			
			System.out.printf("Operação - Depósito %nNovo Saldo: R$ %.2f %n", accountBalance);
			break;

		default:
			System.out.printf("Operação Inválida! %n");	
		}

		userInput.close();
	}
}