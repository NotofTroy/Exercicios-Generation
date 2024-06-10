import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {	
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		Integer searchedNumber;
		
		System.out.println("Digite o número que você deseja encontrar:");
		searchedNumber = userInput.nextInt();
		
		if (numberList.contains(searchedNumber)) {
			System.out.println("O número " + searchedNumber + " está localizado na posição: " + numberList.indexOf(searchedNumber));
		} else {
			System.out.println("O número " + searchedNumber + " não foi encontrado!");
		}
		
		userInput.close();
	}
}