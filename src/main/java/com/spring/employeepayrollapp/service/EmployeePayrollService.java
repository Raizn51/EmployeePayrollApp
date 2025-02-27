package com.spring.employeepayrollapp.service;


import com.spring.employeepayrollapp.dto.EmployeePayrollDTO;
import com.spring.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeePayrollService implements IEmployeePayrollService
{

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData()
    {
         List<EmployeePayrollData> empDataList = new ArrayList<>();
         empDataList.add(new EmployeePayrollData(1,new EmployeePayrollDTO("Gourav Raikwar",564546)));
        return empDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        EmployeePayrollData empData= new EmployeePayrollData(empId,new EmployeePayrollDTO("Sourav",464654));
        return empData;
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData newEmp = new EmployeePayrollData(1,empPayrollDTO);
        return newEmp;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData emp = new EmployeePayrollData(1,empPayrollDTO);
        return emp;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
    }
}
