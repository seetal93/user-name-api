package com.qa.user.util.generators;

import org.springframework.beans.factory.annotation.Autowired;

public class CreateUser {

    @Autowired
    private AbstractUserGen generator;

    public CreateUser(AbstractUserGen generator){
        this.generator = generator;
    }

    public CreateUser(){ }

    public String createUserName(){
        return generator.getUserName();
    }
    
    public AbstractUserGen getGenerator() {
    	return this.generator;
    }

    public void setGenerator(AbstractUserGen generator) {
        this.generator = generator;
    }
}
