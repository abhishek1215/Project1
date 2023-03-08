package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Welcome to ICICI Baank");
		System.out.println("-------------------------");
		
		
		Scanner scan=new Scanner(System.in);
		Bank bank=new BankImpl(5000);

		while(true)
		{
			System.out.println("1:Deposit\n2:Withdraw\n3:CheckBalance\n4:exit\nEnter choice");
			int choice=scan.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("Enter anount to be Deposited:");
				    bank.deposit(scan.nextInt());
				    
				    System.out.println();
				    break;
			
			case 2: 
				    System.out.println("Enter anount to be Withdrawn:");
				    bank.withdraw(scan.nextInt());
				    
				    System.out.println();
				    break;
			
			case 3: System.out.println("Available Balance: Rs."+bank.checkBalance());
			        
			        System.out.println();
			        break;
			
			case 4: System.out.println("Thank You Visit Again!");
				    System.exit(0);
			
			default: 
				     try
				     {
				    	 throw new InvalidChoiceException("Invalid choice");
				     }
				     catch(Exception e)
				     {
				    	 System.out.println(e.getMessage());
				     }
				     System.out.println();
			
			
			}
		}
		
	}
   
}
