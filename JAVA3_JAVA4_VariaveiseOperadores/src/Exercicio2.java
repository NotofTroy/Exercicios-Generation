import java.util.Scanner;

public class Exercicio2 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		float firstGrade, secondGrade, thirdGrade, fourthGrade, gradeAverage;
		
		System.out.println("Digite a primeira nota: ");
		firstGrade = userInput.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		secondGrade = userInput.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		thirdGrade = userInput.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		fourthGrade = userInput.nextFloat();
		
		gradeAverage = (firstGrade + secondGrade + thirdGrade + fourthGrade) / 4;

		System.out.printf("A média final é: %.1f %n", gradeAverage );
		
		userInput.close();
	}
}