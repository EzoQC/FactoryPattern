package com.ezoqc.blog.designpatterns.factory;

public interface Validator<T extends Entity> {
	boolean validate(T entityToValidate);
}
