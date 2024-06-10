import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Exercicio4 {	
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		Set<Integer> integerSet = new HashSet<Integer>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		
		Integer searchedNumber;
		
		System.out.println("Digite o número que você deseja encontrar:");
		searchedNumber = userInput.nextInt();
		
		if (integerSet.contains(searchedNumber)) {
			System.out.println("O número " + searchedNumber + " foi encontrado!");
		} else {
			System.out.println("O número " + searchedNumber + " não foi encontrado!");
		}
		
		userInput.close();
	}
}