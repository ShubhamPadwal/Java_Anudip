//Write a program to calculate the square and cube of numbers 2, 3, and 4.
package iChat1;

public class Square_and_Cube {

	public static void main(String[]args) {
		//// Loop through 2 to 4 and print its square and cube
		for(int number=2;number<=4;number++) {
			int square=number*number;
			int cube=number*number*number;
			System.out.println(square);
			System.out.println(cube);
		}
	}
}
