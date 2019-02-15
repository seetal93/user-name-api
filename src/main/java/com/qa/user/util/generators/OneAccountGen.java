package com.qa.user.util.generators;

import com.qa.user.util.constants.Constants;

public class OneAccountGen extends AbstractUserGen {

    @Override
    public String getUserName() { return generateUserName(Constants.ONE_DIGIT_ACCOUNT); }

}
