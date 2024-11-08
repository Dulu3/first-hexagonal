package com.dulewski.firstheks.user.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
class UserControllerAdvice {

    @ExceptionHandler(GitException.class)
    public ResponseEntity<TechnicalError> handleException(RuntimeException e) {
        var error = new TechnicalError(e.getMessage());
        return new ResponseEntity<>(error, TechnicalError.TEA_POT);
    }


}
