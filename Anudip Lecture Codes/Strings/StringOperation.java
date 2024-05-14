package Strings;

public class StringOperation {

	public static void main(String[] args) {
		
		// 1] Reverse the String
		
		String str="hello this is a new string";
		String s="";
		
		for(int i=str.length()-1;i>=0;i--) {
			char c=str.charAt(i);
			s+=c;
		}
		System.out.println("Reverse of the String is : "+s);
		
		// 2] Adding character to a string
		String st="Hello Worl";
		char c='d';
		st=st+c;
		System.out.println(st);

		//3 ] Palindrome of string;
		
		String palindrome="DAD";
		String reverse="";
		for(int i=palindrome.length()-1;i>=0;i--) {
			char ch=palindrome.charAt(i);
			reverse+=ch;
		}
		if(palindrome.equals(reverse)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
		
		// 4] count vowels and consonants
		int count=0;
		int conso=0;
		for(int i=0;i<str.length();i++) {
			char ctr=str.charAt(i);
			if(ctr=='a' || ctr=='e' || ctr=='i' || ctr=='o' || ctr=='u') {
				count++;
			}else if(ctr!=' '){
				conso++;
			}
		}
		System.out.println("Count of vowels in "+str+" is : "+count);
		System.out.println("Count of consonants in "+str+" is : "+conso);
	}

}
