package org.bg.bpo.register.exception;

public class ResultSetTooBigException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResultSetTooBigException() {
		super("The result set size was over the specified limit. Please be more specific in your search criteria.");
	}

}
