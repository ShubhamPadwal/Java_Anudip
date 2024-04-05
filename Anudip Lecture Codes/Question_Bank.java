/* Create a java class with 5 methods:
   1st method will return the patterns(increasing and decreasing)
   2nd method will return alphabets (small and capital)
   3rd method will return the multiplication table(take input from user)
   4th method will return the logical operation of 2 string(take input from user)
   5th method will return the comparator operation of two number(take input from user)   */
import java.util.*;
public class Question_Bank {
	
	public static void pattern() {
		
		for(int i=1;i<=4;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
				
		System.out.println("---------------------------------------------------------------------------------");
		
		for(int a=4;a>=1;a--) {
			for(int b=a;b>=1;b--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	public static void alphabet() {
		System.out.println("Capital alphabets");
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Small alphabets");
		for(char small='a';small<='z';small++) {
			System.out.print(small+" ");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------------------");
	}
	public static void mult() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		for(int mult=1;mult<=10;mult++) {
			System.out.println(num+"* "+mult+"= "+mult*num);
		}
		System.out.println("---------------------------------------------------------------------------------");
	}
	
	public static void logical() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Strings");
		String one=sc.next();
		String two=sc.next();
		
		if(one.equals(two)) {
			System.out.println("Both strings are same");
		}
		else if(!one.equals(two)) {
			System.out.println("Both strings are not same");
		}
		System.out.println("---------------------------------------------------------------------------------");
	}
	public static void comparison() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		if(num1<num2) {
			System.out.println("Num1 is less than Num2");
		}else if(num1>num2) {
			System.out.println("Num1 is greater than Num2");
			
		}else if(num1==num2){
			System.out.println("Both are same");
		}

		System.out.println("---------------------------------------------------------------------------------");
	}
	
	public static void main(String[]args) {
		Question_Bank.pattern();
		Question_Bank.alphabet();
		Question_Bank.mult();
		Question_Bank.logical();
		Question_Bank.comparison();
		System.out.println("Code by Shubham...");
		
	}

}
