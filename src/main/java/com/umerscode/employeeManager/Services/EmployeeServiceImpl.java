package com.umerscode.employeeManager.Services;

import com.umerscode.employeeManager.Repository.EmployeeRepo;
import com.umerscode.employeeManager.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    public final EmployeeRepo employeeRepo;

    @Override
    public Employee addEmployee(Employee employee) {
//        if(employeeRepo.findByEmail(employee.getEmail()).get() == null){
//            throw new IllegalStateException("Email is taken");
//        }
        employee.setEmployeeCode(UUID.randomUUID().toString().substring(0,6));
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    @Transactional
    public Employee updateEmployee(Long id, Employee employee) {
        Employee employeeFromDB = employeeRepo.findById(id).get();
        employeeFromDB.setImageUrl(employee.getImageUrl());
        employeeFromDB.setJobTitle(employee.getJobTitle());
        employeeFromDB.setPhone(employee.getPhone());
        employeeFromDB.setEmail(employee.getEmail());
        return employeeFromDB;
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }
}
