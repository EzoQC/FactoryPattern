package com.ezoqc.blog.designpatterns.factory;

public class BookValidator implements Validator<Book> {

	@Override
	public boolean validate(Book entityToValidate) {
		return entityToValidate != null &&
				entityToValidate.getIsbn() != null &&
				entityToValidate.getTitle() != null &&
				entityToValidate.getIsbn().trim().length() > 0 &&
				entityToValidate.getTitle().trim().length() > 0;
	}

}
