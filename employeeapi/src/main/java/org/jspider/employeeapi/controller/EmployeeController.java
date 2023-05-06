package org.jspider.employeeapi.controller;

import org.jspider.employeeapi.model.Employee;
import org.jspider.employeeapi.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
       @Autowired
       private EmployeeServices employeeServices;
       @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
       return employeeServices.getAllEmployee();
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable (value = "id")int id){
           return employeeServices.getEmployeeById(id);
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee e1){
           employeeServices.addEmployee(e1);
    }
    @PutMapping("/employees/{id}")
    public void updateEmployee(@PathVariable(value = "id") int id,@RequestBody Employee e){
           employeeServices.updateEmployee(id,e);
    }
    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable(value = "id") int id){
           employeeServices.deleteEmployee(id);
    }
}
