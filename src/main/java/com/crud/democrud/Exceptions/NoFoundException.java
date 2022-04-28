package com.crud.democrud.Exceptions;

public class NoFoundException extends RuntimeException{

    public NoFoundException() {
        super("No found find");
    }
}
