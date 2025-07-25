package com.bank.service;

import java.util.Random;
import java.util.Scanner;

public class Account 
{
	public static String name;
	public static String gender;
	public static String mob_no;
	public static int age;
	public static String pan_no;
	public static int acc_no;
	
	public void OpenAccount()
	{
		System.out.println("* _Welcome to FinSafe Bank_* ");
		System.out.println("-------------------");
		
		System.out.println(" Please provide your details to open your acccount ");
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Please enter your name :: ");
		name=Sc.nextLine();
		
		System.out.println("Enter your age :: ");
		age=Sc.nextInt();
		Sc.nextLine();
		
		System.out.println("Enter your gender (M/F) :: ");
		gender=Sc.nextLine();
		
		System.out.println("Enter your mobile Number :: ");
		mob_no=Sc.nextLine();
		
		System.out.println("Enter your panCard Number :: ");
		pan_no=Sc.nextLine();
		
		Random r = new Random();
		
		acc_no=1000000 + r.nextInt(8999999);
		System.out.println(" Your Account number is : "+acc_no);
		
		
		
		
		
	}

}
