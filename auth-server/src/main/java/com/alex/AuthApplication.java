package com.alex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alex.entity.Account;
import com.alex.repository.AccountRepository;

@SpringBootApplication()
@EnableAutoConfiguration()
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}
	
	@Autowired
	AccountRepository accountRepository;
	
	@Autowired
	public void init(){
		try {
			Account account=new Account();
			account.setName("alex");
			account.setPassword("111aaa");
			account.setRoles(new String []{"ROLE_USER"});
			accountRepository.deleteAll();
			accountRepository.save(account);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
