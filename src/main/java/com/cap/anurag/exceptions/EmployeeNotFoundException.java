package com.cap.anurag.exceptions;

public class EmployeeNotFoundException extends Exception
{
	public EmployeeNotFoundException()
	{
		super();
	}

	public EmployeeNotFoundException(String message) 
	{
		super(message);
	}
}
