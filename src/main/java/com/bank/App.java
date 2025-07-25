package com.bank;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bank.container.JavaConfig;
import com.bank.service.Account;
import com.bank.service.Balance;


public class App 
{
    public static void main( String[] args )
    {
    	
     AnnotationConfigApplicationContext	container  = new AnnotationConfigApplicationContext(JavaConfig.class);
     Scanner  Sc = new Scanner(System.in);  
     Account Ac = container.getBean(Account.class);
     Balance bl = container.getBean(Balance.class);   
     Ac.OpenAccount();
     
     boolean flag =true;
     while(flag)
     {
    	 System.out.println("Welcom ::" +Ac.name+" Account Number :: "+Ac.acc_no);
    	 System.out.println("\nChoose your option ");
    	 
    	 System.out.println("1) Check your balance \n2) Deposite the money \n3) Withdraw the money \n4)Logout ");
    	 int choice =Sc.nextInt();
    	 
    	 switch(choice) 
    	 {
    	 case 1:
    		 bl.CheckBalance();
    		 break;
    		 
    	 case 2: 
    		 bl.DepositeMoney();
    		 break;
    		 
    	 case 3:
    		 bl.WithdrawMoney();
    		 break;
    		 
    	 case 4:
    		 System.out.println("Thank for choosing us !! ");
    		 flag=false;
    		 break;
    	  default:System.out.println("Wrong input ");
    		 
    	 }
    	 
     }
    }
}
