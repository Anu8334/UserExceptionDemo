package com.ar.except;

public class StudentRollException extends RuntimeException {
	private long invalidRoll;

	public StudentRollException(long invalidRoll) {
		super();
		this.invalidRoll = invalidRoll;
	}

	@Override
	public String toString() {
		return "StudentRollException for the invalid Roll No. " + invalidRoll ;
	}
}
