package com.dand.emp_server.service;

import com.dand.emp_server.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getALlEmployees();

    EmployeeDto updateEmployeeById(Long employeeId, EmployeeDto updateEmployee);

    void deleteEmployeeById(Long employeeId);
}
