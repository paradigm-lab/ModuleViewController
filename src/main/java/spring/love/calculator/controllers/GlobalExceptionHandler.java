package spring.love.calculator.controllers;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {

    @ExceptionHandler(value = NullPointerException.class)
    public String handleNullPointerException() {

        return "nullPointerException";
    }

    // Generic Method
    @ExceptionHandler(value = Exception.class)
    public String handleAnyException() {

        return "exception";
    }

}
