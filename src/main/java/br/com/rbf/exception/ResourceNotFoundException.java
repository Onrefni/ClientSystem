package br.com.rbf.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Rommel Fonseca
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2756521134539241778L;

	public ResourceNotFoundException(String exception) {
		super(exception);
	}
}
