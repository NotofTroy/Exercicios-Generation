public class Exercicio2 {	
	
	public static void main(String[] args) {
		
		int numberList[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int sum = 0;
		String oddIndexElements = new String();
		String evenElements = new String();
		
		for (int index = 0; index < numberList.length; index++) {
			
			if (index % 2 != 0) {
				oddIndexElements += numberList[index] + " ";
			}
			
			if (numberList[index] % 2 == 0) {
				evenElements += numberList[index] + " ";
			}
			
			sum += numberList[index];
		}
		
		System.out.println("Elementos nos índices ímpares: " + oddIndexElements);
		System.out.println("Elementos pares: " + evenElements);
		System.out.println("Soma: " + sum);
		System.out.printf("Média: %.2f %n", ((float)sum / numberList.length));
	}
}