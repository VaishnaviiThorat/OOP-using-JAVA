package Assign4;
//Create a class Employee with multiple overloaded methods that have different parameter types (e.g.,
//int, double, String). Demonstrate calling each overloaded method with appropriate arguments.
//import java.util.Scanner;

public class Example_3 {
	//Scanner sc = new Scanner(System.in);
	public static void emp(String name , String post , int empid ){
		  System.out.println(name +" " +post +" "+ empid);
	  }
	  public static void emp(String name , String post , int empid , float salary){
		  System.out.println(name +" " +post +" "+ empid +" "+ salary );
	  }
	  public static void emp(String name , String post , int empid , float salary,String department) {
		  System.out.println(name +" "+ post +" "+ empid +" " +salary +" "+ department );
	  }

	public static void main(String[] args) {
        String name = "Ananya";
        String post= "Software Developer";
        int empid = 21;
        float salary = 150000;
        String department = "Development";
        Example_3.emp(name, post, empid);
        Example_3.emp(name, post, empid, salary);
        Example_3.emp(name, post, empid, salary, department);
        

	}

}
