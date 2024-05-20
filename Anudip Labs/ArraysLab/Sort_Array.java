//  Write a program to sort Array elements

package ArraysLab;

public class Sort_Array {

	public static void main(String[]args) {
		int num[]= {14,2,8,5,47,63,54,2,8,9,74,54,87,2,5,1,9,6,2,55,4,5,25,5};
		int temp=0; // temporary variable
		
		// Sorting array in Ascending order
		
		for(int i=0;i<num.length;i++)// Iterating array from 0 to length
		{
			for(int j=i+1;j<num.length;j++) // Iterating array from i+1 to length
			{
				if(num[i]>num[j]) {
					temp=num[i]; //temp=14
					num[i]=num[j]; // num[i]=2
					num[j]=temp; // num[j] = 14
				}
			}
		}
		
		// Printing array using for loop
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
	}
}
