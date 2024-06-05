import java.util.Scanner;

public class Exercicio4 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String animalSubphylum, animalClass, animalDiet, animalSpecies; 
		
		System.out.println("Digite o subfilo do animal:");
		animalSubphylum = userInput.nextLine();
		
		System.out.println("Digite a classe do animal:");
		animalClass = userInput.nextLine();

		System.out.println("Digite a dieta do animal:");
		animalDiet = userInput.nextLine();

		
		if (animalSubphylum.equalsIgnoreCase("Vertebrado")) {
			if (animalClass.equalsIgnoreCase("Ave")) {
				
				if (animalDiet.equalsIgnoreCase("Carnívoro")) {
					System.out.println("Um animal dentro destes critérios é a Águia.");
				} else if (animalDiet.equalsIgnoreCase("Onívoro")) {
					System.out.println("Um animal dentro destes critérios é a Pomba.");
				} else {
					System.out.println("Não encontrei um animal com estes critérios.");
				}
				
			} else if (animalClass.equalsIgnoreCase("Mamífero")) {
				
				if (animalDiet.equalsIgnoreCase("Onívoro")) {
					System.out.println("Um animal dentro destes critérios é o Homem.");
				} else if (animalDiet.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Um animal dentro destes critérios é a Vaca.");
				} else {
					System.out.println("Não encontrei um animal com estes critérios.");
				}
				
			} else {
				System.out.println("Não encontrei um animal com estes critérios.");
			}
			
		} else if (animalSubphylum.equalsIgnoreCase("Invertebrado")) {
			if (animalClass.equalsIgnoreCase("Inseto")) {
				
				if (animalDiet.equalsIgnoreCase("Hematófago")) {
					System.out.println("Um animal dentro destes critérios é a Pulga.");
				} else if (animalDiet.equalsIgnoreCase("Herbívoro")) {
					System.out.println("Um animal dentro destes critérios é a Lagarta.");
				} else {
					System.out.println("Não encontrei um animal com estes critérios.");
				}
				
			} else if (animalClass.equalsIgnoreCase("Anelídeo")) {
				
				if (animalDiet.equalsIgnoreCase("Hematófago")) {
					System.out.println("Um animal dentro destes critérios é a Sanguessuga.");
				} else if (animalDiet.equalsIgnoreCase("Onívoro")) {
					System.out.println("Um animal dentro destes critérios é a Minhoca.");
				} else {
					System.out.println("Não encontrei um animal com estes critérios.");
				}
				
			} else {
				System.out.println("Não encontrei um animal com estes critérios.");
			}
		}	
		userInput.close();
	}
}