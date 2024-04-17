package QuestionBank_15_04_24;

public class Rectangle implements Shape{

	double length;
	double width;
	
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		double area = length*width;
		System.out.println("Area of Rectangle is :"+area);
		
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		double perimeter=2*(length+width);
		System.out.println("Perimeter of Rectangle is :"+perimeter);
	}
	
	public static void main(String[]args) {
		Rectangle obj=new Rectangle(15,12.5);
		obj.calculateArea();
		obj.calculatePerimeter();
	}

}
