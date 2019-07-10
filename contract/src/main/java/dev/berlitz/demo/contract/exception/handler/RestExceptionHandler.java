package dev.berlitz.demo.contract.exception.handler;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    protected ResponseEntity handleConstraintViolation(ConstraintViolationException ex) {
        ExceptionResponseBody responseBody = ExceptionResponseBody.builder()
                .message("Constraint violada: " + ex.getConstraintName())
                .build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(responseBody);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity handleArgumentNotValid(MethodArgumentNotValidException ex) {
        List<ExceptionResponseBody> responseBody = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(err -> ExceptionResponseBody.builder()
                    .field(err.getField())
                    .message(err.getDefaultMessage())
                    .build()
                ).collect(Collectors.toList());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(responseBody);
    }

}
