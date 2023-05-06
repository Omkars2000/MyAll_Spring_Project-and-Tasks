package org.jspiders.customerapi.controller;

import org.jspiders.customerapi.model.Customer;
import org.jspiders.customerapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService service;

    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer c){
        service.addCustomer(c);
    }

    @GetMapping("/customer")
    public List<Customer> getAllCustomer(Customer c){
       return service.getAllCustomer(c);
    }

    @GetMapping("/customerbyid")
    public Customer getCustomerById(@RequestParam int id){
        return service.getCustomerById(id);
    }

    @GetMapping("/customerbyname")
    public List<Customer> getCustomerByName(@RequestParam String name){
        return service.getCustomerByName(name);
    }

    @GetMapping("/customerbyemail")
    public Customer getCustomerByemail(String email){
        return service.getCustomerByemail(email);
    }

    @GetMapping("/customergreaterage")
    public List<Customer> getCustomerByAgeGreaterThan(@RequestParam int age){
        return service.getCustomerByAge(age);
    }


    @GetMapping("/customertotalpurchase")
    public List<Customer> getCustomerTotalPurchase(@RequestParam double amt){
        return service.getCustomerTotalPurchase(amt);
    }

    @GetMapping("/customers")
    public List<Customer> viewCustomer(@RequestParam String name){
        return service.viewCustomer(name);
    }

    @GetMapping("/customersbycon")
    public List<String> getCustomerByCriteria(@RequestParam int age, @RequestParam double amt){
        return service.getCondition(age,amt);
    }
    @GetMapping("/customersbychar")
    public List<String> viewCustomerByCharAtAnyWhere(@RequestParam String anyChar){
        return service.getNameContains(anyChar);
    }

    @GetMapping("/customerstartchar")
    public List<String > getNameStartWith( @RequestParam String firstChar){
        return service.getCustomerBySpecific(firstChar);
    }
    @GetMapping("/customerendchar")
    public List<String > getNameEndWith(@RequestParam String end){
        return service.getSpecificNameEnd(end);
    }

}
