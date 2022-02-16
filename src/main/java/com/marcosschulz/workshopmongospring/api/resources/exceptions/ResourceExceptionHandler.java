package com.marcosschulz.workshopmongospring.api.resources.exceptions;

import com.marcosschulz.workshopmongospring.domain.services.exceptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    //Anotação para obrigar a pegar esta resposta sempre que cair uma excessão ResourceNotFound
    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ObjectNotFoundException e, HttpServletRequest request){
        String error = "Object not found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
