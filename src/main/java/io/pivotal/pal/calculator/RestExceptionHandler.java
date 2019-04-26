package io.pivotal.pal.calculator;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler {

    //other exception handlers

    @ExceptionHandler({ArithmeticException.class, HttpMessageNotReadableException.class})
    protected ResponseEntity<Object> handleArithmeticException(Exception ex) {
        if (ex instanceof HttpMessageNotReadableException) {
            return new ResponseEntity("INVALID", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity("INVALID: can't divide by zero", HttpStatus.BAD_REQUEST);
    }
}

