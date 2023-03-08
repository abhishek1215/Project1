package com;

public class InvalidAmountException extends RuntimeException {
	String message;
	InvalidAmountException(String message)
	{
		this.message=message;
	}
	@Override
	public String getMessage()
	{
		return message;
	}

}
