/*Write a Java program that prints the numbers from 1 to 50. 
 * But for multiples of four print "Fizz" instead of the number and for the multiples of five print "Buzz". 
 * For numbers which are multiples of both four and five print "FizzBuzz".
 */
package iChat1;

public class Multiples_Problem {

	public static void main(String[]args) {
		
		for(int number=0;number<=50;number++) {
			
			if(number%4==0 && number%5==0) // If number is divisible by both 4 & 5
			{
				System.out.println("FizzBuzz");
			}else if(number%4==0) //If number is divisible by only 4
			{
				System.out.println("Fizz");
			}else if(number%5==0) //If number is divisible by only 5
			{
				System.out.println("Buzz");
			}else {
				System.out.println(number);
			}
		}
	}
}
