package QuestionBank_15_04_24;

public class CheckingAccount implements BankAccount {

	double balance;
	double amount;
	
	public CheckingAccount(double initialBalance) {
		this.balance=initialBalance;
	}
	
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.amount=amount;
		balance=balance+amount;
		System.out.println("Deposited : "+amount);
		System.out.println("Total balance is :"+balance);
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		this.amount=amount;
		if(amount>balance) {
			System.out.println("Insufficient Balance");
		}else {
			balance -=amount;
			System.out.println("Withdrew : "+amount);
		}
		System.out.println("Total balance is :"+balance);
		
	}
	
	public static void main(String[]args) {
		CheckingAccount obj=new CheckingAccount(15000);
		obj.deposit(5000);
		obj.withdraw(8000);
	}

}
