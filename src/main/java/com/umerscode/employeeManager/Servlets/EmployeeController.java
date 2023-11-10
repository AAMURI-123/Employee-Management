package com.umerscode.employeeManager.Servlets;

import com.umerscode.employeeManager.Services.EmployeeServiceImpl;
import com.umerscode.employeeManager.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    @Autowired
    private final EmployeeServiceImpl employeeService;

    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getEmployees(){
        return new ResponseEntity<>(employeeService.getEmployees(), OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id,
                                                   @RequestBody Employee employee){
        return  new ResponseEntity<>(employeeService.updateEmployee(id, employee),OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.addEmployee(employee),CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeById(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
    }

}
