
public class Patterns {
	public static void main(String[]args) {
		
		//Patterns
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------------------------");
		
		// Box Pattern
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------");
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
System.out.println("-------------------------------------------------------------------");
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
System.out.println("-------------------------------------------------------------------");
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
}
