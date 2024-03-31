
public class Operators {
	
	public static void main(String[]args) {
		//WAP to show all the operators in java
		int a=10;
		int b=20;
		//1] Arithmetic Operators
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		if(a==10) {
			System.out.println("Value is 10");
		}
		else if(a>=1 &&a<=10 ) {
			System.out.println("Value is between 1 and 10");
		}
		
		//logical operators
		if(a==10 &&b==20) {
			System.out.println("Both are equal");
		}
		else if(a!=10 || b==20) {
			System.out.println("Only B is equal to 20");
		}
		
		
		//2]WAP to find area and perimeter of circle
	
		double pi=3.142678;
		int radius=5;
		double area=pi*radius*radius;
		double perimeter=2*pi*radius;
		System.out.println("Area of circle is: "+area);
		System.out.println("Perimeter of circle is: "+perimeter);
		
		
	}
}
