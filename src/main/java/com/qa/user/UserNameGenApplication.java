package com.qa.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.qa.user.util.generators.AbstractUserGen;
import com.qa.user.util.generators.CreateUser;
import com.qa.user.util.generators.OneAccountGen;


@SpringBootApplication
public class UserNameGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserNameGenApplication.class, args);
	}


	@Bean
	public CreateUser createAccount(){
		return new CreateUser();
	}

	@Bean
	public AbstractUserGen accountGenerator(){
		return new OneAccountGen();
	}


}


