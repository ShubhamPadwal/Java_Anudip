// WAP to search a particular element in the given array.

package ArraysLab;

public class Array_Search {

	public static void main(String[]args) {
		
		int arr[]= {7,5,8,4,52,47,98,65,2,4,7,3,65,82,41,45};
		int toSearch=41;  // Element to search
		
		boolean isPresent = false;
		
		// Iterating array from 0 to length
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==toSearch) // If element is present....
			{
				isPresent=true; // Change value of isPresent from false to true
				break;
			}
		}
		
		if(isPresent==true) {
			System.out.println(toSearch+" is present in array");
		}else {
			System.out.println(toSearch+" is not present in array");
		}
	}
}
