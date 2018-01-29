package ru.mail.yura.exception;

public class NegativeValueException extends Exception {
	
	private int detail;
	
	public NegativeValueException(int detail) {
		this.detail = detail;
	}
	
	public String getMessage() {
		return "NegativeValueException[" + detail + "]";
	}

}
