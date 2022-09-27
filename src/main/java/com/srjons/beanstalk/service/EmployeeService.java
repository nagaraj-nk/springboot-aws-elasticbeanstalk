package com.srjons.beanstalk.service;

import com.srjons.beanstalk.model.Employee;
import com.srjons.beanstalk.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public void create(Employee employee) {
        employeeRepo.save(employee);
    }

    public Employee get(int id) {
        return employeeRepo.findById(id).get();
    }

    public void delete(int id) {
        employeeRepo.deleteById(id);
    }
}
