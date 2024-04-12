package Inheritance_Lab;

public class Square extends Shape { //class Square extends class Shape also class Rectangle extends Shape
                                    // Parent class : Shape
	                                // Child classes: Square and Rectangle
	                                // Here is Hierarchical inheritance.
	public static void main(String[]args) {
		Square s=new Square();
		s.area(4, 4);
	}
}
