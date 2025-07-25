package com.bank.container;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bank.service.Account;
import com.bank.service.Balance;

@Configuration
public class JavaConfig 
{
	@Bean
	public Account acc()
	{
		Account ac = new Account();
		return ac;
	}
	
	@Bean
	public Balance Balance()
	{
		Balance b = new Balance();
		return b;
	}

}
