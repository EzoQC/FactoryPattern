package com.ezoqc.blog.designpatterns.factory;

/**
 * 
 * 
 * @author Sylvain Cloutier
 */
public class AppStart {
	public static void main(String[] args) {
		AppStart.exampleWithUser();
		AppStart.exampleWithBook();
	}


	private static void exampleWithBook() {
		System.out.println("Example with Book");
		Book book = new Book();

		book.setTitle("Working Effectively with Legacy Code");
		book.setIsbn("0131177052");
		
		AppStart.validate(book);
	}


	private static void exampleWithUser() {		
		System.out.println("Example with User");
		User user = new User();

		user.setFirstName("Michael");
		user.setLastName("Feathers");
		
		AppStart.validate(user);
		
	}
	
	private static void validate(Entity myself) {
		boolean isValid = ValidatorFactory
				.makeInstance(myself)
				.validate(myself);
		
		System.out.println("Is valid: " + isValid);
	}
}
