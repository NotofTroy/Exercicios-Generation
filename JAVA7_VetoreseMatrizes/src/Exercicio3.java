public class Exercicio3 {	
	
	public static void main(String[] args) {
		
		int numberMatrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int primaryDiagonalSum = 0;
		int secondaryDiagonalSum = 0;
		String primaryDiagonalElements = new String();
		String secondaryDiagonalElements = new String();
		
		for (int lineIndex = 0; lineIndex < numberMatrix.length; lineIndex++) {
			
			if (lineIndex == 0) {
				
				for (int columnIndex = 0; columnIndex < numberMatrix.length; columnIndex++) {
					
					if (columnIndex == 0) {
						
						primaryDiagonalSum += numberMatrix[lineIndex][columnIndex];
						primaryDiagonalElements += numberMatrix[lineIndex][columnIndex] + " ";
						
					} else if (columnIndex == 2) {
						secondaryDiagonalSum += numberMatrix[lineIndex][columnIndex];
						secondaryDiagonalElements += numberMatrix[lineIndex][columnIndex] + " ";
					}
				}
				
			} else if (lineIndex == 1) {
				
				for (int columnIndex = 0; columnIndex < numberMatrix.length; columnIndex++) {
					
					if (columnIndex == 1) {
						
						primaryDiagonalSum += numberMatrix[lineIndex][columnIndex];
						primaryDiagonalElements += numberMatrix[lineIndex][columnIndex] + " ";
						secondaryDiagonalSum += numberMatrix[lineIndex][columnIndex];
						secondaryDiagonalElements += numberMatrix[lineIndex][columnIndex] + " ";
					} 
				}
				
			} else if (lineIndex == 2) {
				
				for (int columnIndex = 0; columnIndex < numberMatrix.length; columnIndex++) {
					
					if (columnIndex == 0) {
						
						secondaryDiagonalSum += numberMatrix[lineIndex][columnIndex];
						secondaryDiagonalElements += numberMatrix[lineIndex][columnIndex] + " ";
						
					} else if (columnIndex == 2) {
						
						primaryDiagonalSum += numberMatrix[lineIndex][columnIndex];
						primaryDiagonalElements += numberMatrix[lineIndex][columnIndex] + " ";
					}
				}
			}
		}
		
		System.out.println("Elementos da Diagonal Principal: " + primaryDiagonalElements);
		System.out.println("Elementos da Diagonal Secundária: " + secondaryDiagonalElements);
		System.out.println("Soma dos Elementos da Diagonal Principal: " + primaryDiagonalSum);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + secondaryDiagonalSum);
	}
}