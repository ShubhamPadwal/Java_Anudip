
import java.util.*;
public class Loops {

	public static void main(String[]args) {
		
		// 1] WAP to print numbers 50 to 1 in reverse in a single line using for loop
		System.out.println("Using for loop :");
		for(int i=50;i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		
		// 2] WAP to print numbers 50 to 1 in reverse in a single line using while loop 
		System.out.println("Using While loop :");
		int a=50;
		while(a>=1) {
			System.out.print(a+" ");
			a--;
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		
		// 3] WAP to print numbers 50 to 1 in reverse in a single line using do while loop
		
		System.out.println("Using Do-While loop :");
		int num=50;
		do {
			System.out.print(num+" ");
			num--;
		}
		while(num>=1); // When num will become less than 1 it will terminate the execution.
		
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		// 4] WAP to print multiplication table of number taken by user using while loop
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int input=sc.nextInt();  // Stores the integer type user input in variable "input". 
		int table=1;
		while(table<=10) {
			System.out.println(input+" * "+table+" = "+input*table);
			table++;
		}
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
		
		
		// 5] WAP to print prime numbers from 1 to 100
		
		System.out.print("Prime numbers from 1 to 100 are : ");
		for(int prime=1;prime<=100;prime++) {  // Loop will run from 1 to 100
			int count=0;

			for(int n=1;n<=prime;n++) { // This loop runs from 1 to our variable prime
				if(prime%n==0) {
					count++;	// If variable prime is divisible by "n" then increment the count.	
				}
			}
			if(count==2) { 
				System.out.print(prime+" ");
			}
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------");
		
   }
	
}
