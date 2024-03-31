
public class ChefModule1 extends Kitchen1 {
	
	public static void message() {
		
		Kitchen1 obj=new Kitchen1();
		obj.cook();
		obj.prepare();
		System.out.println("Your order will prepare soon");

	}

}
