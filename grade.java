package Assignment_1;
import java.util.*;
public class grade {

	public static void main(String[] args) {
		  float score;
	        char grade='\0';

	        Scanner number = new Scanner(System.in);
	        score = number.nextFloat();

	        if (score >= 90) {
	            grade = 'A';
	        } else if (score >= 80) {
	            grade = 'B';
	        } else if (score >= 70) {
	            grade = 'C';
	        } else if (score >= 60) {
	            grade = 'D';
	        } else if (score >= 50) {
	            grade = 'E';
	        } else if (score < 50) {
	            grade = 'F';
	        }
	        System.out.println("Grade is " + grade);
	        number.close();
	}

}
