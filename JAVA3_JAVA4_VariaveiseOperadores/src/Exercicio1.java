import java.util.Scanner;

public class Exercicio1 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		float wage, bonus, newWage;
		
		System.out.println("Digite o salário: ");
		wage = userInput.nextFloat();
		
		System.out.println("Digite o abono: ");
		bonus = userInput.nextFloat();
		
		newWage = wage + bonus;
		
		System.out.printf("O novo salário é: %.2f %n", newWage );
		
		userInput.close();
	}
}