package Assignment_1;
import java.util.Scanner;
public class calculations {
    @SuppressWarnings("resource")
	public static void main(String[] args) {    	
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number: ");
         double num1 = scanner.nextDouble();

       System.out.print("Enter second number: ");
         double num2 = scanner.nextDouble();
         
         do {
            System.out.print("Enter the operator 0.EXIT, 1.ADD, 2.SUBTRACT 3.MULTIPLY 4.DIVIDE ");
            char operator = scanner.next().charAt(0);
        
            double result;
            switch (operator) {
                case '1' :
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '2' :
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '3' :
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '4' :
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                    
                case '0':
                    System.out.println("Exit");
                    return;
                    
                default:
                    System.out.println("Invalid operator");
            }

        } while (true);
         //scanner.close();
    }
	
}