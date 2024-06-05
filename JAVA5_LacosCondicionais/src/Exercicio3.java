import java.util.Scanner;

public class Exercicio3 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String name; 
		int age;
		boolean isFirstDonation;
		
		System.out.println("Digite o Nome do doador:");
		name = userInput.nextLine();
		
		System.out.println("Digite a Idade do doador:");
		age = userInput.nextInt();

		System.out.println("Primeira doação de sangue?");
		isFirstDonation = userInput.nextBoolean();
		
		if (age >= 18 && age <= 69) {
			if (age < 60) {
				System.out.println(name + " está apte para doar sangue!");
			} else if (!isFirstDonation) {
				System.out.println(name + " está apte para doar sangue!");
			} else {
				System.out.println(name + " não está apte para doar sangue!");
			}
			
		} else {
			System.out.println(name + " não está apte para doar sangue!");
		}
		
		userInput.close();
	}
}