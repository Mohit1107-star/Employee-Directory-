package com.mohit.EmployeeCRUD.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class EmployeeDTO {
    @NotBlank(message = "Employee name cannot be blank")
    private String ename;

    @Positive(message = "Salary must be greater than 0")
    private double sal;

    public EmployeeDTO() {}

    public EmployeeDTO(String ename, double sal) {
        this.ename = ename;
        this.sal = sal;
    }

    public String getEname() { return ename; }
    public void setEname(String ename) { this.ename = ename; }

    public double getSal() { return sal; }
    public void setSal(double sal) { this.sal = sal; }
}
