package com.umerscode.employeeManager.Repository;

import com.umerscode.employeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    Optional<Employee> findByEmail(String email);
}
