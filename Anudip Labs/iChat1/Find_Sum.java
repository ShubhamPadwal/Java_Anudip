/*Suppose, 38154 is a number for which we have to find the sum until it becomes a single-digit number.
3 + 8 + 1 + 5 + 4 = 21

Further, we will add 2 and 1.
2 + 1 = 3

We get 3 as a single-digit number.*/
package iChat1;

public class Find_Sum {

	public static void main(String[] args) {
        int num = 38154;
        int sum;

        while (num >= 10) {
            sum = 0; // Initialize sum and reset after every iteration
            while (num > 0) {
                int remainder = num % 10; // Find remainder
                sum += remainder; // Store remainder in sum
                num /= 10; 
            }
            num = sum;
        }
        
        System.out.println("The single-digit sum is: " + num);
    }
}
