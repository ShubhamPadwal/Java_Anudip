package Inheritance_Lab;

public class Father extends Grandfather{
	
	@Override
	public void property() {
		System.out.println("properties derived from Grandfather");
		System.out.println("Friendly Nature");
		System.out.println("Animal Lover");
	}
	
	public void propertyOfFather() {
		System.out.println("properties of Father");
		System.out.println("Nature Lover");
		System.out.println("Strong Mindset");
	}
	
	public static void main(String[]args) {
		Father obj=new Father();
		obj.property();
		obj.propertyOfFather();
	}
}
