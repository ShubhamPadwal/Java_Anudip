package Strings;
import java.util.*;
public class Strings_QB {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		// 1] 1. Print the string entered by the user
		
		System.out.println("Enter any String");
		String str=sc.nextLine();
		System.out.println(str);
		
		// 2] Find the length of the word "UserManagement".
		
		String word="UserManagement";
		System.out.println("Length of word is: "+word.length());
		
		// 3] Find the word "the" from the paragraph and replace it with "thou".
		
		String para="The sun set behind the horizon, casting hues of orange and pink across the sky.";
		para=para.replace("the", "thou");
		System.out.println(para);
		
		
		// 4] Check whether "e" present in the word "Umbrella"
		
		String s="Umbrella";
		System.out.println("e isPresent: "+s.contains("e"));
		
		// 5] Check the first and last occurence of 'o' in "Hello World"

		String st="Hello World";
		System.out.println("First occurrence at index :"+st.indexOf('o'));
		System.out.println("Last occurrence at index :"+st.lastIndexOf('o'));
		
		
		// 6] Convert the String data into a list

		String[]parts=st.split(" ");
		System.out.println(parts[0]);
		System.out.println(parts[1]);
		
		// 7] Find vowels count in the string
		// 8] Find the consonants count from the String
		
		String str1="Hello this is new string";
		int vowels=0;
		int conso=0;
		for(int i=0;i<str1.length();i++) {
			char ctr=str1.charAt(i);
			if(ctr=='a' || ctr=='e' || ctr=='i' || ctr=='o' || ctr=='u') {
				vowels++;
			}else if(ctr!=' '){
				conso++;
			}
		}
		System.out.println("Count of vowels in "+"\""+str1+"\""+" is : "+vowels);
		System.out.println("Count of consonants in "+"\""+str1+"\""+" is : "+conso);
		
		// 9] Remove the consonants from the string 
		// 10] Remove the vowels from the string
		
		String str2="";
		String str3="";
		for(int i=0;i<str1.length();i++) {
			char ctr=str1.charAt(i);
			if(ctr!='a' && ctr!='e' && ctr!='i' && ctr!='o' && ctr!='u') {
				str2+=ctr;
			}else {
				str3+=ctr;
			}
		}
		System.out.println("String after removing consonants :"+str3);
		System.out.println("String after removing vowels : "+str2);
	}

}
