package br.com.rbf.exception;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Rommel Fonseca
 *
 */
public class ExceptionResponse implements Serializable {

	private static final long serialVersionUID = -5497105299129472393L;
	
	private Date timestamp;
	private String message;
	private String details;

	public ExceptionResponse(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}
