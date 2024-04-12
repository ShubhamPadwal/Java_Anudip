/*Create a class GrandFather with methods name, property , physicalApperance. describe each properties of Grandfather in the class properly in the main method
create Father class extending GrandFather and decribe each properties of father deriving from Grandfather(use Override annotation) in the main method 
create Son class extending Father and decribe each properties of a Son deriving from Father(use Override annotation) in the main method 
*/

package Inheritance_Lab;

public class Grandfather {
	String name;
	public void name(String name) {
		this.name=name;
		System.out.println("Name is: "+name);
	}
	
	public void property() {
		System.out.println("Friendly Nature");
		System.out.println("Animal Lover");
	}
	
	public void physicalApperance() {
		System.out.println("Tall");
		System.out.println("Muscular body");
		System.out.println("Dark Skin");
	}
	
	public static void main(String[]args) {
		Grandfather obj=new Grandfather();
		obj.name(null);
		obj.property();
		obj.physicalApperance();
	}

}
