package iChat1;

public class Voting_Age {
	public static void main(String[]args) {
		int age=25;
		int vage=18;
		
		if(age>=vage) // Compares age with voting age 
		{
			System.out.println("Old enough to vote!");
		}else {
			System.out.println("Not old enough to vote.");
		}
	}

}
