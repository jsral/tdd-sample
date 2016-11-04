package com.jsral.tdd;

public class InvalidDni extends Exception {
    public InvalidDni(Exception e) { super(e); }
    public InvalidDni(String message)
    {
        super(message);
    }
}