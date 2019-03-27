package com.example.demo.AdviceServices;

public class BookNotFoundException extends RuntimeException {

    public void  BookNot(String message, Throwable cause) {
        message="ERRO!";
        cause=cause;

    }
    // ...
}
