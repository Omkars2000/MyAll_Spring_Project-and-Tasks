package org.jspider.springdatajpa.cntroller;

import org.jspider.springdatajpa.model.Customer;
import org.jspider.springdatajpa.repository.CustomerRepository;
import org.jspider.springdatajpa.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

  @Autowired
  private CustomerService service;

  @PostMapping("/customers")
  public void addCourse(@RequestBody Customer c){
    service.addCustomer(c);
  }

  @GetMapping("/allcustomers")
  public List<Customer> getAllCourses(){
    return service.getAllCustomer();
  }





}
