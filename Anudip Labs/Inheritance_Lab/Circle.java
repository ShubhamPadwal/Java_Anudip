/*Create a class called circle . It contains:
 *Two instance variables: radius (of the type double) and color (of the type String).
 *One public methods: getArea(),simple Constructor  with default value of 1.0 and "red", and parameterized constructor.
*/

package Inheritance_Lab;

public class Circle {
	double radius;
	String color;
	
	public void getArea() {
		double area=3.14*radius*radius;
		System.out.println("Area of circle is : "+area);
		System.out.println("Color is :"+color);
		System.out.println("Radius is :"+radius);
	}

	public Circle() {  // Default Constructor
		this.radius = 1.0;
		this.color = "red";
	}
	
	  public Circle(double radius, String color) { //Parameterized Constructor
		  super(); 
		  this.radius = radius;
	      this.color = color;
	      
	 }
	 
	
	  public static void main(String[]args) {
		Circle obj=new Circle(); //Object of Default Constructor
		obj.getArea();
		
		Circle obj1=new Circle(5,"Blue");  //Object of Parameterized Constructor & passing args
		obj1.getArea();
	}
	

}
