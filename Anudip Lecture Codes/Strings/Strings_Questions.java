package Strings;
import java.util.*;
public class Strings_Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1] Java Program to Get a Character From the Given String

		String str="Hello World";
		System.out.println(str.charAt(0));
		
		// 2] Java Program to Replace a Character at a Specific Index

		int index=6;
		for(int i=0;i<=str.length()-1;i++) {
			if(i==index) {
			//	System.out.println(str.charAt(index));
				str=str.replace('W', 'H');
				
			}
		}
		
    	System.out.println(str);
		// 3] Java Program to Reverse a String
		
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			reverse+=ch;
		}
		System.out.println(reverse);
		
		//VIMP  4] Java Program to Sort a String 

		String toSort="Hii I am Shubham";
		
		char[]charArray=toSort.toCharArray();
		
		Arrays.sort(charArray);
		
		String Sorted=new String(charArray);
		System.out.println("Sorted String is : "+Sorted);
		
		// VIMP 5] Java Program to Swap 2 numbers
		
		int a=10;
		int b=15;
		int temp =a; // temp=10
		a=b;  // a=15
		b=temp; //b=10
		System.out.println(a);
		System.out.println(b);
		
		// 6] Java Program to Check Whether the Given String is Palindrome 

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println(s);
		String pali="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			pali+=ch;
		}
		if(s.equals(pali)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String is not palindrome");
		}

		// 7] Java Program to find the remainder of even number from 1 to 100

		System.out.println("Enter a number from which you want to divide :");
		int num=sc.nextInt();

		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i+" % "+num+" = "+i%num);
			}
		}
		
		// 8] Java Program to Remove spaces from string 

		System.out.println(str.trim()); // Using trim() removes leading and trailing spaces
			
		String str1="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				str1+=ch;
			}
		}
		System.out.println(str1);
		
		// 9] Java Program to Compare two strings

		String s1="Shubham";
		String s2="shubham";
		boolean isequals=s1.equals(s2);
		System.out.println(isequals);
		
		// 10] Java Program to Compare two strings lexicographically

		System.out.println(s1.compareTo(s2));

		// 11] Java Program to Insert a string into another string
		s1=s1.concat(s2);
		System.out.println(s1);
	}

}
