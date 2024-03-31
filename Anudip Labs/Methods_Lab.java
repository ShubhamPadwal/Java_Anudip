
public class Methods_Lab {
	// Create a method multiplication which take 2 arguments , return the result and print the final answer
    
	public static int mult(int a,int b) {
		int result=a*b;
		return result;
	}
	
	// Create a method of type string , check if grades is greater than 80 return "Congratulations on getting grade A+" , else return "You need to work hard"
	
	public static String grade(int marks) {
		if(marks>=80) {
			return "Congratulations on getting grade A+";
		}
		else {
			return "You need to work hard";
		}
	}
	
	// Create a method of type void , make any pattern in it by taking as argument and then print it.
	
	public static void pattern(int rows) {
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//Create a method of all primitive type in java, call the methods and print the final output.
	public static byte sum(byte a,byte b) {
		byte result=(byte)(a+b);
		return result;
	}
	
	public static short sub(short a,short b) {
		short result=(short)(a-b);
		return result;
	}
	
	public static int areaOfRectangle(int a,int b) {
		int result=a*b;
		return result;
	}
	
	public static long num (long a,long b) {
		long result=a+b;
		return result;
	}
	
	public static float per(float a,float b,float c,float d,float e) {
		float result=a+b+c+d+e/5;
		return result;
	}
	
	public static double dsum(double a,double b) {
		double result=a+b;
		return result;
	}
	
	public static boolean res(int age) {
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static char grades(int marks) {
		if(marks>=80) {
			return 'A';
		}
		else if(marks>=60) {
			return 'B';
		}
		else if(marks>=35){
			return 'P';
		}
		else {
			return 'F';
		}
	}
	
	
	public static void main(String[]args) {
		System.out.println("Your result is: "+Methods_Lab.mult(2, 10));
		System.out.println(Methods_Lab.grade(85));
		Methods_Lab.pattern(4);
		System.out.println(Methods_Lab.sum((byte)4,(byte) 5));
		System.out.println(Methods_Lab.sub((short)6,(short)5));
		System.out.println(Methods_Lab.areaOfRectangle(15, 10));
		System.out.println(Methods_Lab.num(165465468, 5484650));
		System.out.println(Methods_Lab.per(65.5f, 75.20f, 85.30f, 74.23f, 82.20f));
		System.out.println(Methods_Lab.dsum(54656.5189, 548416.29840));
		System.out.println(Methods_Lab.res(18));
		System.out.println(Methods_Lab.grades(85));
		
	}
}
