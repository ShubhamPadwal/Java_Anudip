
public class Lab_1 {
	
	public static void main(String[]args) {

	//1) Write a program to print "Hello I am at Anudip Foundation".
	System.out.println("Hello I am at Anudip Foundation");
	
	//2) Write a program to demonstrate each data types.
	
	byte b= 100;
	System.out.println(b);
	
	
	short s=12345;
	System.out.println(s);
	
	
	int i=123456789;
	System.out.println(i);
	
	
	long l= 54899849456465488l;
	System.out.println(l);
	
	
	char ch='S';
	System.out.println(ch);
	
	
	float f=99.99f;
	System.out.println(f);
	
	
	double d=498498.5984;
	System.out.println(d);
	
	
	boolean ans=true;
	System.out.println(ans);
	
	
	String str="Shubham";
	System.out.println(str);
	
	
	String[]arr = {"Shubham","Padwal"};
	
		System.out.println(arr[1]);
		
		//3) Write a program to add , subtract , divide , multiply two numbers
		
		System.out.println(2+5);
		System.out.println(10-5);
		System.out.println(2*5);
		System.out.println(25/5);
		
		//4) Print 1 to 10 numbers
		
		for(int num=1;num<=10;num++) {
			System.out.println(num);
		}
		
		//5) Print 5 names using array
		
		String []names= {"Shubham","Manish","Tushar","Ganesh","Madhu"};
		for (String name : names) {
            System.out.println(name);
		}
  }
}
