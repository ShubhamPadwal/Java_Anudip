// Write a program to take two numbers as a input from user and 
//also take which operation want to perform as a input from user and print output.

import java.util.*;
public class OperatorsDemo {
	
	public static void main(String[]args) {
		String input;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number to perform operation");
		int a=sc.nextInt(); //Stores first input
		
		System.out.println("Enter Second number to perform operation");
		int b=sc.nextInt(); //Stores second input
		
		int result;
		
		while(true) {
		System.out.println("Enter which operation do you want to perform");
		input=sc.next();  // Stores string input
		
		if(input.equals("+")) {
			result=a+b;
			System.out.println(a+"+"+b+"="+result);
			break;  // Breaks the loop
		}
		
		else if(input.equals("-")) {
			result=a-b;
			System.out.println(a+"-"+b+"="+result);
			break;  // Breaks the loop
		}
		
		else if(input.equals("*")) {
			result=a*b;
			System.out.println(a+"*"+b+"="+result);
			break;   // Breaks the loop
		}
		
		else if(input.equals("/")) {
			result=a/b;
			System.out.println(a+"/"+b+"="+result);
			break;  // Breaks the loop
		}
		
		else {
			System.out.println("Please enter valid input");
		}
		}
	}

}
