package com.bank.service;

import java.util.Scanner;

public class Balance 
{
	static double bal=0;
	
	public void CheckBalance()
	{
		System.out.println("You bank balanace is :: "+bal);

	}
	
	public void DepositeMoney()
	{
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the ammount you want deposite :: ");
		double d = Sc.nextDouble();
		bal=bal+d;
		
		System.out.println(d+ " Rupees has been credited Successfully ");
		
	}
	
	public void WithdrawMoney()
	{
		 Scanner Sc = new Scanner (System.in);
		System.out.println("Enter mount you want to withdraw :: ");
		double d =Sc.nextDouble();
		if(d>bal)
		{
			System.out.println("Insufficient Funds ");
		}
		else
		{
			bal = bal-d;
			System.out.println("Your account has been debited rupees : "+d);
		}
		
		
		
	}

}
