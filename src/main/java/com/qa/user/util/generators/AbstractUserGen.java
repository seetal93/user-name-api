package com.qa.user.util.generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.qa.user.util.constants.Constants;

public abstract class AbstractUserGen {

    private List<String> userNameList = new ArrayList<>();

    public abstract String getUserName();

    protected String generateUserName(int userLength){
        String generatedUserName = constructString(userLength);
        while(userNameList.contains(generatedUserName)){
            generatedUserName = constructString(userLength);
        }
        userNameList.add(generatedUserName);
        return generatedUserName;
    }

    private String constructString(int length){
        StringBuilder userName = new StringBuilder();
        int typeSelector = new Random().nextInt(Constants.TYPES_OF_ACCOUNTS);

        switch(typeSelector){
            case 0:
                userName.append(Constants.ACCOUNT_TYPE_A);
                break;
            case 1:
                userName.append(Constants.ACCOUNT_TYPE_B);
                break;
            case 2:
                userName.append(Constants.ACCOUNT_TYPE_C);
                break;
        }

        for (int j = 0; j < length; j++) {
            userName.append(generateDigit());
        }
        return userName.toString();
    }

    private String generateDigit(){
        return new Random().nextInt(10)+"";
    }
    
    public void setUserNameList(List<String> userNameList) {
    	this.userNameList = userNameList;
    }
}