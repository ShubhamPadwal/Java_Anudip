// Write a program on arrays to Read and Display all the array elements,find array length 
package ArraysLab;

public class Read_Array {
	public static void main(String[]args) {
		int num[]= {4,5,8,7,25,96,48,12,35,24,71,54,8,24,8,4,9};
		
		// Array length
		System.out.println("Length of array : "+num.length);
		
		// Printing array using for-each loop
		
		for(int numbers:num) {
			System.out.print(numbers+" ");
		}
	}

}
