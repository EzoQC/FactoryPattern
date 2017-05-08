package com.ezoqc.blog.designpatterns.factory;

public class UserValidator implements Validator<User> {

    @Override
    public boolean validate(User entityToValidate) {
        return entityToValidate != null 
            && entityToValidate.getFirstName() != null
            && entityToValidate.getLastName() != null 
            && entityToValidate.getFirstName().trim().length() > 0
            && entityToValidate.getLastName().trim().length() > 0;
    }
}
