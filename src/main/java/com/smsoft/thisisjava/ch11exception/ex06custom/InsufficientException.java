package com.smsoft.thisisjava.ch11exception.ex06custom;

public class InsufficientException extends Exception{
    public InsufficientException() {}

    public InsufficientException(String message) {super(message);}
}
