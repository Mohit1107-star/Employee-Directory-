package com.mohit.EmployeeCRUD.exception;

public class EmpAlreadyExistsException extends RuntimeException{
    public EmpAlreadyExistsException(String message){
        super(message);
    }
}
