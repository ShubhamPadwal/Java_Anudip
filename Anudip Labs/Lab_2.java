
public class Lab_2 {
	public static void main(String[]args) {
	
		//1) Write a program to print months name using switch case
		int input=3;
		String month;
		switch(input) {
		
		case 1:
			System.out.println("January");
			break;
			
		case 2:
			System.out.println("February");
			break;
			
		case 3:
			System.out.println("March");
			break;
			
		case 4:
			System.out.println("April");
			break;
			
		case 5:
			System.out.println("May");
			break;
			
		case 6:
			System.out.println("June");
			break;
			
		case 7:
			System.out.println("July");
			break;
			
		case 8:
			System.out.println("August");
			break;
			
		case 9:
			System.out.println("September");
			break;
			
		case 10:
			System.out.println("October");
			break;
			
		case 11:
			System.out.println("November");
			break;
			
		case 12:
			System.out.println("December");	
			break;
			
		default:
			System.out.println("Invalid Input");
		break;
			
		}
		
		//2) write a program to print table of 42
		
		int i;
		int num=42;
		for(i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+num*i);
		}
		
		//3) write a program to check grades of student based on marks(create marks object and check using if else)
		
		char grade;
		int marks=68;
		if(marks>=80) {
			System.out.println("Your grade is A");
		}
		else if (marks<80 && marks>=60){
			System.out.println("Your grade is B");
		}
		else {
			System.out.println("Your grade is C");
		}
		
		//4) Write numbers from 1 to 20, if number is 10 skip the number. and if number is 15 break the loop
		int n;
		for(n=1;n<=20;n++) {
			if(n==10) {
				continue;
			}
			System.out.println(n);
		}
	
	
	//5)Print capital and small alphabets
	//Capital
		
	for (char ch = 'A'; ch <= 'Z'; ch++) {
        System.out.println(ch + " ");
	}
	//Small
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " ");
        }

 }
	}

