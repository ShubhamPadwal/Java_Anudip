/*2.Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that 
overrides the getArea() method to calculate the area of a rectangle.
*/

package Question_Bank_06_04_24;

public class Rectangle extends Shape {
	@Override
	public int getArea(int l,int b) {
		area=l*b;
		return area;
		
	}

	public static void main(String[]args) {
		Rectangle obj=new Rectangle();
		System.out.println("Area of Rectangle is :"+obj.getArea(4,5));
	}
}
