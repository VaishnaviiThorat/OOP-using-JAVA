package Assign4;
//Write a Vehicle class with overloaded methods that have a different number of parameters.
//Demonstrate calling these overloaded methods with various numbers of arguments.

import java.util.Scanner;
public class Example_2 {
	public static Scanner sc = new Scanner(System.in);

	public static void car(String color) {

		String color1 = sc.nextLine();
		System.out.println("color: " +color1);
		
	}
	
	public static void car(String color, String modelName) {
		
		String color1 = sc.nextLine();
		String modelName1 = sc.nextLine();
		System.out.print("color: "+ color1 +" "+  "modelName: "+ modelName1);
		
	}
	
	public static void car(String color, String modelName, int carNo ) {
		
		String color1 = sc.nextLine();
		String modelName1 = sc.nextLine();
		int carNo1 = sc.nextInt();
		System.out.print("color: "+ color1 +" "+  "modelName: "+ modelName1 + " " + "carNo: "+ carNo1);
	}
	
	public static void car(String color, String modelName, int carNo, float milage) {
			String color1 = sc.nextLine();
			String modelName1 = sc.nextLine();
			int carNo1 = sc.nextInt();
			float milage1 = sc.nextFloat();
			System.out.print("color: "+ color1 +" "+  "modelName: "+ modelName1 + " " + "carNo: "+ carNo1
					+ " "+ "milage1: "+ milage1);	
	}
	

	public static void main(String[] args) {
		String color = null;
		String modelName = null;
		int CarNo=0;
		float milage = 0.0f;
			
		Example_2.car(color);
		Example_2.car(color , modelName);
		Example_2.car(color , modelName , CarNo);
		Example_2.car(color , modelName , CarNo, milage);
		
	}
}


