package Assign4;
//Build a class Student which contains details about the Student and compile and run its instance. 

import java.util.Scanner;

class Student{
	private String name;
	private int rollNo;
	private float percent;
	//private char grade;
	
	public void acceptRecord( ) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Name  :   ");
			this.name = sc.nextLine();
			System.out.print("Roll no.  :   ");
			this.rollNo = sc.nextInt();
			System.out.print("Percentage  :   ");
			this.percent = sc.nextFloat();
			
		}
	}
	public void printRecord( ) {
		System.out.print(this.name+" "+this.rollNo+" "+ this.percent);
	}
	
	
	
}
public class Example_1 {

	public static void main(String[] args) {
		Student student = new Student();
		student.acceptRecord();
		student.printRecord();
		
	
	}

}
