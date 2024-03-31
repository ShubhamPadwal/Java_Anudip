
public class JavaBeansDemo {
	public static void baking() {
		System.out.println("Take all ingredients");
		System.out.println("Mix all");
		System.out.println("Bake");
	}
	
	public static int add() {
		int a=10;
		int b=20;
		int sum=a+b;
		return sum;
	}
	
	public static boolean guessMyAge() {
		int age=24;
		boolean result = age==24? true:false;
		return result;
	}
	
	public static String greetings() {
		return"Good Morning";
	}
	
	public static byte sub() {
		byte a=1;
		byte b=2;
		byte subs=(byte)(b-a);
		return subs;
	}
	
	public static short sum() {
		short a=15;
		short b=20;
		short sum=(short)(a+b);
		return sum;
	}
	
	public static long num() {
		long a=1505188498;
		long b=2065484;
		long sum=a+b;
		return sum;
	}
	
	public static float fsum() {
		float a=1554.2554f;
		float b=2065.484f;
		float sum=a+b;
		return sum;
	}
	
	public static double dsum() // No args
	{
		double a=155544.2565454;
		double b=2054865.48544;
		double sum=(double)(a+b);
		return sum;
	}
	
	public static char choice() {
		char ch='A';
		return ch;
	}
	public static int mult(int a,int b) {
		int res=a*b;
		return res;
	}
	
	public static String message(String name)// String method with args
	{
		return "Good Morning,"+name;
	}
	
	public static String hello(String name,int age)// String method with args
	{
		return "Good Morning,"+name+". Your age is "+age;
	}

	public static void main(String[]args) {
		JavaBeansDemo.baking(); //Calling Method
		JavaBeansDemo b=new JavaBeansDemo(); // by creating object
		b.baking();
		System.out.println(JavaBeansDemo.add());
		System.out.println(JavaBeansDemo.guessMyAge());	
		System.out.println(JavaBeansDemo.greetings());
		System.out.println(JavaBeansDemo.sub());// byte method
		System.out.println(JavaBeansDemo.sum());//short method
		System.out.println(JavaBeansDemo.num());// long method
		System.out.println(JavaBeansDemo.fsum());//float method
		System.out.println(JavaBeansDemo.dsum());// double method
		System.out.println(JavaBeansDemo.choice());// char method
		System.out.println(JavaBeansDemo.mult(10, 10));// calling mult method with args
		System.out.println(JavaBeansDemo.message("Shubham")); // calling string message method with args
		System.out.println(JavaBeansDemo.hello("Shubham",22));
	}
}
