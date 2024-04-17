package QuestionBank_15_04_24;

public class Triangle implements Shape{

	double base;
	double height;
	double side1;
	double side2;
	double side3;
	
	public Triangle(double base,double height) {
		this.base=base;
		this.height=height;
	}
	
	public Triangle(double side1,double side2,double side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		double area=0.5*(base*height);
		System.out.println("Area of Triangle is: "+area);		
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		double perimeter=side1+side2+side3;
		System.out.println("Perimeter of Triangle is :"+perimeter);
	}
	
	public static void main(String[]args) {
		Triangle area=new Triangle(5.2,3.5);
		Triangle perimeter=new Triangle(5,3,2);
		area.calculateArea();
		perimeter.calculatePerimeter();
	}

}
