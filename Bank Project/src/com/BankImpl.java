package com;

public class BankImpl implements Bank {
	 int balance;
	 public BankImpl(int balance)
	 {
		 this.balance=balance; 
	 }
     @Override
    public  void deposit(int amount)
     {
    	 if(amount>0)
    	 {
    	 System.out.println("Deposiying Rs."+amount);
    	 balance=balance+amount;   //balance +=amount;
    	 System.out.println("Amount Deposited Successfully");
    	 }
    	 else
    	 {
    		try
    		{
    			 throw new InvalidAmountException("Invalid Amount");
    		}
    		catch(Exception e)
    		{
    			System.out.println(e.getMessage());
    		}
    	 }
     }
     @Override
     public void withdraw(int amount)
     {
    	 if(amount<=balance)
    	 {
    	 System.out.println("Withdrawing Rs."+amount);
    	 balance -=amount;         //balance=balance-amount;
    	 System.out.println("Anount Withdrawn Successfully");
    	 }
    	 else
    	 {
    		 try
     		{
     			 throw new InsufficientBalanceException("Invalid Balance");
     		}
     		catch(Exception e)
     		{
     			System.out.println(e.getMessage());
     		}
    	 }
     }
     @Override
     public int checkBalance()
     {
    	 return balance;
     }

}
