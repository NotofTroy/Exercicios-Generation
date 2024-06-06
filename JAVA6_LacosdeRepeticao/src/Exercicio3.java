import java.util.Scanner;

public class Exercicio3 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int age = 0, youngerPeopleCount = 0, olderPeopleCount = 0;

		
		while (age >= 0) {
			System.out.println("Digite uma idade:");
			age = userInput.nextInt();
			
			if (age >= 0 && age < 21) {
				youngerPeopleCount++; 
			} else if (age > 50) {
				olderPeopleCount++;
			}
		}
			
		System.out.println("Total de pessoas menores de 21 anos: " + youngerPeopleCount);
		System.out.println("Total de pessoas maiores de 50 anos: " + olderPeopleCount);
		
		userInput.close();
	}
}