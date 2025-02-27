package com.spring.employeepayrollapp.service;

import com.spring.employeepayrollapp.dto.EmployeePayrollDTO;
import com.spring.employeepayrollapp.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService
{
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int emId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId,EmployeePayrollDTO empPayrollDTO);

    void deleteEmployeePayrollData(int emId );

}
