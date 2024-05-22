package com.dailypractise;

/*Implement a superclass BankAccount with attributes accountNumber and balance.
Create subclasses SavingsAccount and CheckingAccount that inherit from BankAccount 
and add specific methods such as calculateInterest() 
for SavingsAccount and deductFee() for CheckingAccount.*/
class BankAccount{
	public void accountNumber(long accNum)
	{
		System.out.println("The account number:"+accNum);
	}
	public void balance(long bal)
	{
		System.out.println("Balance: "+bal);
	}
}
class SavingsAccount extends BankAccount
{
	public void calculateInterest(float interest)
	{
		System.out.println("Interest: "+interest);
	}
}
class CheckingAccount extends BankAccount{
	public void deductFee(long deductFee)
	{
		System.out.println("Deduct Fee: "+deductFee);
	}
}
public class TestBankAccount {

	public static void main(String[] args) {
		Che
	}

}
