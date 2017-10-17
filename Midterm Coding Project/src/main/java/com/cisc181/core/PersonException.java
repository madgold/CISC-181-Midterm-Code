package com.cisc181.core;

public class PersonException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Person person;
	
	public PersonException(Person p) {
		this.setPerson(p);
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
