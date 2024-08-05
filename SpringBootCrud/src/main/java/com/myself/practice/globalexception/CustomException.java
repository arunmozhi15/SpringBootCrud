package com.myself.practice.globalexception;




public class CustomException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException (String msg)
	{
		super(msg);
	}
}
