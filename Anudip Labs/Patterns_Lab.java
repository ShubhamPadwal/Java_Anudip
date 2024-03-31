
public class Patterns_Lab {

	public static void main(String[]args) {
		 /* 1        
	        1  2
	        1  2  3*/
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------------------------------");
		
 /*	    * * * *
	    * * *
	    * *
	    *
	                          */
		
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------");

/*
		 *
	     * *
	     * * *
	     * * * *               */
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------");
		/*
		 4321
         321
         21
         1
		 */

		for(int i=4;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
	}
		System.out.println("-------------------------------------------------------------------");
		
		 /*  1
		     2 3
		     4 5 6
 		     7 8 9 10   */
		int num=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}

			System.out.println();
	}
}
}
