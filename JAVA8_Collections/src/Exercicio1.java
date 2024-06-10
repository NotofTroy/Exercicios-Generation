import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {	
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		ArrayList<String> colorList = new ArrayList<String>();
		String color = new String();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + "ª" + " cor:");
			color = userInput.nextLine();
			
			colorList.add(color);
		}
		
		System.out.println("\nListar todas as cores: ");
		
		for (int i = 0; i < colorList.size(); i++) {
			System.out.println(colorList.get(i));
		}
		
		
		System.out.println("\nOrdenar as cores: ");
		colorList.sort(null);
		
		
		for (int i = 0; i < colorList.size(); i++) {
			System.out.println(colorList.get(i));
		}
		
		userInput.close();
	}
}