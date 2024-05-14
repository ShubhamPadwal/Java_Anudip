package Strings;

public class Sort {

	public static void main(String[] args) {
	    // Input string
	    String str = "Hello World A ";
	    
	    // Empty string to store sorted characters
	    String sort = "";

	    // Iterate through each character in the string
	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        
	        // Iterate through each character already in the sort string
	        int j;
	        for (j = 0; j < sort.length(); j++) {
	            // Compare current character with characters in sorted string
	            if (ch <= sort.charAt(j)) {
	                break; // Found position to insert character
	            }
	        }
	        
	        // Insert current character at correct position in the sorted string
	        sort = sort.substring(0, j) + ch + sort.substring(j);
	    }
	    
	    // Output the sorted string
	    System.out.println("Sorted string: " + sort);
	}


}
