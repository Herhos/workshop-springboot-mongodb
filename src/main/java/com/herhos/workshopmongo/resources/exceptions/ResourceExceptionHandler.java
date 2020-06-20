package com.herhos.workshopmongo.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.herhos.workshopmongo.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler
{
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound
		(ObjectNotFoundException e, HttpServletRequest request)
	{
		HttpStatus httpStatus = HttpStatus.NOT_FOUND;
		
		StandardError stardardError = new StandardError
			(
				System.currentTimeMillis(), 
				httpStatus.value(),
				"Não encontrado!",
				e.getMessage(),
				request.getRequestURI()
			);
		return ResponseEntity.status(httpStatus).body(stardardError);
	}
}
