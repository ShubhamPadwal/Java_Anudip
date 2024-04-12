package Inheritance_Lab;

public class Son extends Father{

	@Override
	public void property() {
		System.out.println("properties derived from Grandfather");
		System.out.println("Friendly Nature");
		System.out.println("Animal Lover");
	}
	
	@Override
	public void propertyOfFather() {
		System.out.println("properties of Father");
		System.out.println("Nature Lover");
		System.out.println("Strong Mindset");
	}
	
	public void propertyOfSon() {
		System.out.println("properties of Son");
		System.out.println("Kind");
		System.out.println("Hard working");
	}
	
	public static void main(String[]args) {
		Son obj=new Son();
		obj.property();
		obj.propertyOfFather();
		obj.propertyOfSon();
	}
}
