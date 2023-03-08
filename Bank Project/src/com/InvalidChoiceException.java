package com;

public class InvalidChoiceException extends RuntimeException {
	String message;
	InvalidChoiceException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}
}
