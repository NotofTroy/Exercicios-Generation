import java.text.DecimalFormat;

public class Exercicio4 {	
	
	public static void main(String[] args) {
		
		float gradeMatrix[][] = {
				{4.0f, 5.0f, 7.0f, 3.0f}, 
				{2.5f, 6.5f, 4.7f, 8.0f}, 
				{10.0f, 8.5f, 9.5f, 8.0f}, 
				{9.0f, 6.5f, 7.6f, 8.2f}, 
				{5.0f, 5.0f, 5.0f, 6.3f}, 
				{7.0f, 8.0f, 9.0f, 8.5f}, 
				{5.5f, 3.5f, 2.5f, 1.0f}, 
				{8.0f, 9.0f, 10.0f, 9.5f}, 
				{5.6f, 5.8f, 6.5f, 7.0f}, 
				{7.5f, 8.5f, 9.5f, 10.0f}};
		
		String gradeAverages = new String();
		
		
		for (int lineIndex = 0; lineIndex < gradeMatrix.length; lineIndex++) {
			
			float gradeSum = 0f;
			String roundedGradeSum = new String();
			
			for (int columnIndex = 0; columnIndex < 4; columnIndex++) {
				gradeSum += gradeMatrix[lineIndex][columnIndex];
			}

			roundedGradeSum = new DecimalFormat("#.# ").format(((float) gradeSum / 4));
			gradeAverages += roundedGradeSum;
		}
		
		System.out.println("Médias de notas dos alunos: " + gradeAverages);
	}
}