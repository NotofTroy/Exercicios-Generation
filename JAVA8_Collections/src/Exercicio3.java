import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio3 {	
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		Set<Integer> integerList = new HashSet<Integer>();
		Iterator<Integer> integerListIterator = integerList.iterator();
		
		Integer number = Integer.valueOf(0);
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "°" + " número inteiro. Não repita números: ");
			number = userInput.nextInt();
			
			integerList.add(number);
		}
		
		integerListIterator = integerList.iterator();
		System.out.println("\nListar dados do Set: ");

		while (integerListIterator.hasNext()) {
			System.out.println(integerListIterator.next());
		}
		
		userInput.close();
	}
}