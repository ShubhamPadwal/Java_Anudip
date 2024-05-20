// WAP to perform subtraction of two matrices. 

package ArraysLab;

public class Sub_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Initialize matrix 1
		int mat1[][]= {
				{4,3,2},
				{5,4,6},
				{9,5,7}
		};
		
		// Initialize matrix 2
		int mat2[][]= {
				{9,8,7},
				{6,5,4},
				{4,8,7}
		};
		
		// Find rows and columns in matix
		int rows=mat1.length;
		int col=mat1[0].length;
		
		// New array to store substraction
		
		int result[][]=new int[rows][col];
		
		// Substraction
		
		for(int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat1[0].length;j++) {
				result[i][j]=mat1[i][j] - mat2[i][j];
			}
		}
		
		// Printing result array
		
		for(int i=0;i<mat1.length;i++) {
			for(int j=0;j<mat1[0].length;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
