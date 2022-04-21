package com.tech.employeemanager.controler;

import com.tech.employeemanager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeControler {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public 
}
