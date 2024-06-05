import java.util.Scanner;

public class Exercicio5 {	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int productCode, productAmount;
		
		System.out.println("Digite o código do produto:");
		productCode = userInput.nextInt();
		
		System.out.println("Digite a quantidade do produto:");
		productAmount = userInput.nextInt();
		
		switch (productCode) {
		case 1:
			System.out.printf("Produto: Cachorro Quente \nValor Total: R$ %.2f", productAmount * 10.00, "\n");
			break;
			
		case 2:
			System.out.printf("Produto: X-Salada \nValor Total: R$ %.2f", productAmount * 15.00, "\n");
			break;
			
		case 3:
			System.out.printf("Produto: X-Bacon \nValor Total: R$ %.2f", productAmount * 18.00, "\n");
			break;
			
		case 4:
			System.out.printf("Produto: Bauru \nValor Total: R$ %.2f", productAmount * 12.00, "\n");
			break;
			
		case 5:
			System.out.printf("Produto: Refrigerante \nValor Total: R$ %.2f", productAmount * 8.00, "\n");
			break;
			
		case 6:
			System.out.printf("Produto: Suco de laranja \nValor Total: R$ %.2f", productAmount * 13.00, "\n");
			break;
		}
		userInput.close();
	}
}