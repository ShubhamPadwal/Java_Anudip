/* Bank Account Interface: Create an interface named BankAccount with methods deposit(double amount) and withdraw(double amount).
 * Implement this interface in classes for different types of bank accounts like SavingsAccount and CheckingAccount. 
 * Test these implementations by creating objects of each account type and performing deposit and withdrawal operations.
 */
package QuestionBank_15_04_24;

public interface BankAccount {
	
	public void deposit(double amount);
	public void withdraw(double amount);

}
