package com.umerscode.employeeManager.Services;

import com.umerscode.employeeManager.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    List<Employee> getEmployees();
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}
