package com.ezoqc.blog.designpatterns.factory;

public class ValidatorFactory {
    @SuppressWarnings("unchecked")
    public static <T extends Entity> Validator<T> makeInstance(T entityType) {
        Validator<T> validatorReturned = null;
		        
        if (entityType instanceof User) {
            validatorReturned = (Validator<T>) new UserValidator();
        } else if (entityType instanceof Book) {
        	validatorReturned = (Validator<T>) new BookValidator();
        }
		
        return validatorReturned;
    }
}