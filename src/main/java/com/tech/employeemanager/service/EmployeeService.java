package com.tech.employeemanager.service;

import com.tech.employeemanager.exception.UserNotFoundException;
import com.tech.employeemanager.model.Employee;
import com.tech.employeemanager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    @Autowired
    private  EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee findEmployeeById(Long id){
        return (employeeRepository.findById(id).orElseThrow(() -> new UserNotFoundException("Usuario " + id + "não encontrado")));
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);

    }


}
