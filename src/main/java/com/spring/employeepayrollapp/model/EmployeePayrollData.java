package com.spring.employeepayrollapp.model;

import com.spring.employeepayrollapp.dto.EmployeePayrollDTO;

public class EmployeePayrollData
{
    private long employeeId;
    private String name;
    private long salary;

    public EmployeePayrollData()
    {
    }
    public EmployeePayrollData(long employeeId, EmployeePayrollDTO employeePayrollDTO ) {
        this.employeeId = employeeId;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;

    }


    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

}

