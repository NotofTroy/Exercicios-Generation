import java.util.Scanner;

public class Exercicio4 {	
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int age, genderIdentity, developerType;
		char shouldLoopContinue = 's';
		int backendDevCount = 0, 
		womenFrontendDevCount = 0, 
		seniorMenMobileDevCount = 0, 
		youngNonbinaryDevCount = 0,
		surveyedEmployeeCount= 0,
		ageSum = 0;
		
		while (shouldLoopContinue == 's') {
			
			System.out.println("Digite a idade:");
			age = userInput.nextInt();
			
			System.out.println("Digite o código da identidade de gênero, de acordo com o guia a seguir:");
			System.out.println("1 – Mulher Cis");
			System.out.println("2 – Homem Cis");
			System.out.println("3 – Não Binário");
			System.out.println("4 – Mulher Trans");
			System.out.println("5 – Homem Trans");
			System.out.println("6 – Outros");
			genderIdentity = userInput.nextInt();
			
			while (genderIdentity < 1 || genderIdentity > 6) {
				System.out.println("Resposta inválida! Digite de um número de 1 a 6 conforme instruído anteriormente.");
				genderIdentity = userInput.nextInt();
			}
			
			System.out.println("Digite o código do tipo de desenvolvedor do colaborador, de acordo com o guia a seguir:");
			System.out.println("1 – Backend");
			System.out.println("2 – Frontend");
			System.out.println("3 – Mobile");
			System.out.println("4 – FullStack");
			developerType = userInput.nextInt();
			
			while (developerType < 1 || developerType > 4) {
				System.out.println("Resposta inválida! Digite de um número de 1 a 4 conforme instruído anteriormente.");
				developerType = userInput.nextInt();
			}
			
			if (developerType == 1) {
				backendDevCount ++;
			}
			
			if (developerType == 2 && (genderIdentity == 1 || genderIdentity == 4)) {
				womenFrontendDevCount ++;
			}
			
			if (developerType == 3 && age > 40 && (genderIdentity == 2 || genderIdentity == 5)) {
				seniorMenMobileDevCount ++;
			}
			
			if (developerType == 4 && age < 30 && genderIdentity == 3) {
				youngNonbinaryDevCount ++;
			}
			
			surveyedEmployeeCount++;
			ageSum += age;
			
			System.out.println("Inserir dados de um novo colaborador? Digite 'S' para continuar ou 'N' para parar.");
			shouldLoopContinue = Character.toLowerCase(userInput.next().charAt(0));
			
			while (shouldLoopContinue != 's' && shouldLoopContinue != 'n') {
				System.out.println("Resposta inválida! Digite 'S' para continuar ou 'N' para parar.");
				shouldLoopContinue = Character.toLowerCase(userInput.next().charAt(0));
			}
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: " + backendDevCount);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + womenFrontendDevCount);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + seniorMenMobileDevCount);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + youngNonbinaryDevCount);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + surveyedEmployeeCount);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f %n", ((float)ageSum / surveyedEmployeeCount));
		
		userInput.close();
	}
}