
public class JavaClass extends JavaBeansDemo{

	static String name="Shubham";
	
	public static void main(String[]args) {
		System.out.println(JavaClass.name);
		JavaBeansDemo obj=new JavaBeansDemo();
		obj.baking();
		System.out.println(obj.fsum());
		System.out.println(obj.message("Shubham"));
		}
}
