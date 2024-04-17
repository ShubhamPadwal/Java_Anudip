package QuestionBank_15_04_24;

public class Circle implements Shape{
	double r;
	
	public Circle(double r) {
		this.r=r;
	}
	
	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		double area=3.14*r*r;

		System.out.println("Area of circle is :"+area);
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		double perimeter=2*3.14*r;
		System.out.println("Perimeter of circle is :"+perimeter);
	}

	public static void main(String[]args) {
		Circle obj=new Circle(5.1);
		obj.calculateArea();
		obj.calculatePerimeter();
	}
}
