package Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1] append ------> Used to add text at the end of the existing text.
		
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" World");
		System.out.println(sb);
		
		// 2] length()
		
		System.out.println(sb.length());
		
		// 3] capacity() ------> the total allocated capacity can be found by the capacity( ) method

		System.out.println(sb.capacity());
		
		// 4] charAt() ------->  This method returns the char value in this sequence at the specified index.
		System.out.println(sb.charAt(4));
		
		// 5] delete() -------->  Deletes a sequence of characters from the invoking object
		
		sb.delete(0, 5);
		System.out.println(sb);
		
		// 6] deleteCharAt() -------> Deletes the character at the index specified by the loc
		
		System.out.println(sb.deleteCharAt(2));
		
		// 7] insert()	-----> Inserts text at the specified index position
		
		System.out.println(sb.insert(0,"Hello"));
		
		// 8] reverse()	-----> Reverse the characters within a StringBuffer object
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		// 9] replace() ------>	Replace one set of characters with another set inside a StringBuffer object
		
		System.out.println(sb.reverse());
		System.out.println(sb.replace(0, 5, "Hii"));
	}

}
