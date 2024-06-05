import java.util.Scanner;

public class Exercicio6 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String employeeName;
		int positionCode;
		float wage;
		
		System.out.println("Nome do colaborador:");
		employeeName = userInput.nextLine();
		
		System.out.println("Cargo:");
		positionCode = userInput.nextInt();
		
		System.out.println("Salário:");
		wage = userInput.nextFloat();
		
		switch (positionCode) {
		case 1:
			System.out.println("Nome do colaborador: " + employeeName);
			System.out.println("Cargo : Gerente");
			System.out.printf("Salário ajustado: R$ %.2f", wage + wage * 0.1f);
			break;
		case 2:
			System.out.println("Nome do colaborador: " + employeeName);
			System.out.println("Cargo : Vendedore");
			System.out.printf("Salário ajustado: R$ %.2f", wage + wage * 0.07f);
			break;
		case 3:
			System.out.println("Nome do colaborador: " + employeeName);
			System.out.println("Cargo : Supervisore");
			System.out.printf("Salário ajustado: R$ %.2f", wage + wage * 0.09f);
			break;
		case 4:
			System.out.println("Nome do colaborador: " + employeeName);
			System.out.println("Cargo : Motorista");
			System.out.printf("Salário ajustado: R$ %.2f", wage + wage * 0.06f);
			break;
		case 5:
			System.out.println("Nome do colaborador: " + employeeName);
			System.out.println("Cargo : Estoquista");
			System.out.printf("Salário ajustado: R$ %.2f", wage + wage * 0.05f);
			break;
		case 6:
			System.out.println("Nome do colaborador: " + employeeName);
			System.out.println("Cargo : Técnico de TI");
			System.out.printf("Salário ajustado: R$ %.2f", wage + wage * 0.08f);
			break;
		}

		userInput.close();
	}
}