package com.abdullah.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	public ResourceNotFoundException(Object id) {
		super("Resourse Not Found. Id " + id);
	}
	

}
