package br.com.rbf.exception;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Rommel Fonseca
 *
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidJwtAuthenticationException extends AuthenticationException {
	
	private static final long serialVersionUID = -1515721767207746129L;

	public InvalidJwtAuthenticationException(String exception) {
		super(exception);
	}
}
