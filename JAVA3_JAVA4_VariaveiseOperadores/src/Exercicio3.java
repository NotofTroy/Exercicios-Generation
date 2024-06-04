import java.util.Scanner;

public class Exercicio3 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		float grossWage, nightTimeBonus, overtime, overtimePay, deductions, netWage;
		
		System.out.println("Digite o salário bruto: ");
		grossWage = userInput.nextFloat();
		
		System.out.println("Digite o adicional noturno: ");
		nightTimeBonus = userInput.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		overtime = userInput.nextFloat();
		
		System.out.println("Digite os descontos: ");
		deductions = userInput.nextFloat();
		
		overtimePay = overtime * 5;
		
		netWage = grossWage + nightTimeBonus + overtimePay - deductions;
		
		System.out.printf("O salário líquido é: %.2f %n ", netWage );
		
		userInput.close();
	}
}