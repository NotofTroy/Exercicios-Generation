import java.util.Stack;
import java.util.Iterator;
import java.util.Scanner;


public class Exercicio2 {	
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		Stack<String> bookStack = new Stack<String>();
		
		int chosenOption = -1;
		
		
		do {
			String bookName = new String();
			
			System.out.println("\n******************\n");
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair");
			System.out.println("\n******************\n");
			System.out.println("Insira a opção desejada: ");
			
			
			chosenOption = Integer.parseInt(userInput.nextLine());
			// read as String, converted to int upon assigning to variable.
			// done this way to avoid Scanner skipping later inputs due to cursor positioning.

			
			switch(chosenOption) {
			
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
				
			case 1:
				
				System.out.println("Insira o nome do livro que deseja adicionar: ");
				bookName = userInput.nextLine();
				bookStack.push(bookName);
				
				System.out.println("\nLivro Adicionado!");
				
				break;
				
			case 2:
				
				System.out.println("\nLista de Livros na Pilha:\n");
				
				for (Iterator<String> bookStackIterator = bookStack.iterator(); bookStackIterator.hasNext();) {
					System.out.println(bookStackIterator.next());
				}
				
				break;
				
			case 3:
					
				if (bookStack.empty()) {
					System.out.println("\nA Pilha está vazia!");
					
				} else {
					
					bookStack.pop();
					System.out.println("\nPilha:\n");
					
					for (Iterator<String> bookStackIterator = bookStack.iterator(); bookStackIterator.hasNext();) {
						
						System.out.println(bookStackIterator.next());
					}
					
					System.out.println("\nUm Livro foi retirado da pilha!");
				}
				
				break;
			}
			
		} while (chosenOption != 0);
		
		userInput.close();
	}
}