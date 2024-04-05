
import java.util.Scanner;
public class Problem_Set {
	
	public static void main(String[]args) {
		// WAP to print smallest and largest of three numbers
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println("Largest number is :"+num1);
		}else if(num2>num1 && num2>num3) {
			System.out.println("Largest number is :"+num2);
		}else {
			System.out.println("Largest number is :"+num3);
		}
		
		if(num1<num2 && num1<num3) {
			System.out.println("Smallest number is :"+num1);
		}else if(num2<num1 && num2<num3) {
			System.out.println("Smallest number is :"+num2);
		}else {
			System.out.println("Smallest number is :"+num3);
		}
		
		System.out.println("--------------------------------------------------------------------");
		
		//WAP to print the average of the 3 numbers
		
		int average=(num1+num2+num3)/3;
		System.out.println("Average of these numbers is :"+average);
		
		System.out.println("--------------------------------------------------------------------");
		
		//WAP to find the square of numbers from 1 to 10
		
		for(int num=1;num<=10;num++) {
			System.out.println("Square of "+num+" is :"+num*num);
		}
		
		System.out.println("--------------------------------------------------------------------");
		
		//WAP to find odd numbers from 1 to 100 
		
		System.out.println("Odd Numbers from 1 to 100 are : ");
		for(int odd=1;odd<=100;odd++) {
			if(odd % 2==1) {
				System.out.print(odd+" ");
			}
		}
	}
}
