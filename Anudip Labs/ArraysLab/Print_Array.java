// WAP to print array in descending order.

package ArraysLab;

public class Print_Array {
	
	public static void main(String[]args) {
		int arr[]= {10,4,5,7,2,4,6,7,8,1};
		int temp=0; // temporary variable
		
		// Sorting array in descending order
		
		for(int i=0;i<arr.length;i++) // iterate from 0 to arr.length
		{
			for(int j=i+1;j<arr.length;j++)  // iterate from i+1 to arr.length
			{
				 if(arr[i] > arr[j]) //10 > 4
				 {    
	                   temp = arr[i];   // temp = 10
	                   arr[i] = arr[j]; // arr[i]= 4 
	                   arr[j] = temp;   // arr[j]= 10
	               }  
			}
		}
		
		// Printing array using for-each loop
		for(int elements:arr) {
			System.out.print(elements+" ");
		}
	}

}
