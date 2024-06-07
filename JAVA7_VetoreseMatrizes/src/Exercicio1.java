import java.util.Scanner;

public class Exercicio1 {	
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int numberList[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int searchedNumber;
		boolean wasNumberFound = false;
		
			
		System.out.println("Digite o número que você deseja encontrar:");
		searchedNumber = userInput.nextInt();
		
		for (int index = 0; index < numberList.length; index++) {
			
			if (searchedNumber == numberList[index]) {
				wasNumberFound = true;
				System.out.println("O número " + searchedNumber + " está localizado na posição: " + index);

				break;
			}
		}
		
		if (!wasNumberFound) {
			System.out.println("O número " + searchedNumber + " não foi encontrado!");
		}

		userInput.close();
	}
}