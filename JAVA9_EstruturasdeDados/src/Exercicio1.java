import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Exercicio1 {	
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		Queue<String> customerQueue = new LinkedList<String>();		
		int chosenOption = -1;
		
		
		do {
			String customerName = new String();
			
			System.out.println("\n******************\n");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar Cliente da fila");
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
				
				System.out.println("Insira o nome do cliente que deseja adicionar: ");
				customerName = userInput.nextLine();
				customerQueue.add(customerName);
				
				System.out.println("\nCliente Adicionado!");
				
				break;
				
			case 2:
				
				System.out.println("\nLista de Clientes na Fila:\n");
				for (Iterator<String> customerQueueIterator = customerQueue.iterator(); customerQueueIterator.hasNext();) {
					System.out.println(customerQueueIterator.next());
				}
				
				break;
				
			case 3:
					
				if (customerQueue.poll() == null) {
					System.out.println("\nA Fila está vazia!");
					
				} else {
					
					System.out.println("\nFila:\n");
					
					for (Iterator<String> customerQueueIterator = customerQueue.iterator(); customerQueueIterator.hasNext();) {
						
						System.out.println(customerQueueIterator.next());
					}
					
					System.out.println("\nO Cliente foi Chamado!");
				}
				
				break;
			}
			
		} while (chosenOption != 0);
		
		userInput.close();
	}
}