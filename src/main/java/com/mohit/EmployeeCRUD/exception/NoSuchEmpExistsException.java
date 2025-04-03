package com.mohit.EmployeeCRUD.exception;

public class NoSuchEmpExistsException extends RuntimeException{
    public NoSuchEmpExistsException(String message){
        super(message);
    }
}
