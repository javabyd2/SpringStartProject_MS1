package com.sda.spring.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Arrays;

@ControllerAdvice
public class ExceptionHandleAdvice {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity handleException(BookNotFoundException e){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND,
                        "nieznaleziono rekordu",
                        Arrays.asList("test1", "test2")
                ));
    }

    @ExceptionHandler(CategoryNotFoundException.class)
    public ResponseEntity handleException(CategoryNotFoundException e){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND,
                        "nieznaleziono rekordu",
                        Arrays.asList("test3", "test4")
                ));
    }

    @ExceptionHandler(AuthorNotFoundException.class)
    public ResponseEntity handleException(AuthorNotFoundException e){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND,
                        "nieznaleziono rekordu",
                        Arrays.asList("test5", "test6")
                ));
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity handleException(UserNotFoundException e){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND,
                        "nieznaleziono rekordu",
                        Arrays.asList("test7", "test8")
                ));
    }

    @ExceptionHandler(RoleNotFoundException.class)
    public ResponseEntity handleException(RoleNotFoundException e){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND,
                        "nieznaleziono rekordu",
                        Arrays.asList("test9", "test10")
                ));
    }

    @ExceptionHandler(PublisherNotFoundException.class)
    public ResponseEntity handleException(PublisherNotFoundException e){
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND,
                        "nieznaleziono rekordu",
                        Arrays.asList("test11", "test12")
                ));
    }
}
