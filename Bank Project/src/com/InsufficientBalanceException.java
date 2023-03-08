package com;

public class InsufficientBalanceException extends RuntimeException {
	private String message;
	InsufficientBalanceException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}

}
/**Documentation comment -> Rules to develop custom Exception
 * -----------------------------------------------------
 * 1.Create a class with the Exception name.
 * 2a.if class extends Exception->checked exception
 * 2b.if class extends RuntimeException->Unchecked exception
 * 3.Override getMessage()->(variable,constructor,method)
 * 4.invoke the exception object using throw keyword & handle it using try and catch blocks
 **/
