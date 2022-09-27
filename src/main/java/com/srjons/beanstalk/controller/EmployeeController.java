package com.srjons.beanstalk.controller;

import com.srjons.beanstalk.model.Employee;
import com.srjons.beanstalk.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public String create(@RequestBody Employee employee) {
        employeeService.create(employee);
        return "Added";
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Employee get(@PathVariable("id") int id) {
        return employeeService.get(id);
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> delete(@PathVariable("id") int id) {
        employeeService.get(id);
        return ResponseEntity.noContent().build();
    }
}
