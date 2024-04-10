package Question_Bank_06_04_24;

public class Car extends Vehicle {
	@Override
	public void drive() {
		System.out.println("Repairing a car");
	}
	
	public static void main(String[]args) {
		Car obj = new Car();
		obj.drive();
	}

}
