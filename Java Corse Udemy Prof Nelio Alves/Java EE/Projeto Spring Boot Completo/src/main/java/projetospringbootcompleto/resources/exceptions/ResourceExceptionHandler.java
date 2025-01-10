package projetospringbootcompleto.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;
import projetospringbootcompleto.service.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException msg, HttpServletRequest request) {
		String        error  = "Resource not Found";
		HttpStatus    status = HttpStatus.NOT_FOUND;
		StandardError err    = new StandardError(Instant.now(), status.value(), error, msg.getMessage(),
				request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}

}
