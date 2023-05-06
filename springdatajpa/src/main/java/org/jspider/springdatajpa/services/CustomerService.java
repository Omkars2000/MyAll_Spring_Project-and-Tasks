package org.jspider.springdatajpa.services;


import org.jspider.springdatajpa.model.Customer;
import org.jspider.springdatajpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public void addCustomer(Customer c){
        repository.save(c);
    }

    public List<Customer> getAllCustomer() {
        List<Customer> customerList=repository.findAll();
        return customerList;
    }



    //get all customer
  public List<Customer> getCustomerById(int id){
        return repository.findAll();
  }
    //get customer by id

    public Customer findById( int id){
        return repository.findById(id).orElse(null);
    }
    //get customer by name
    public List<Customer> findByCustomerName(String name){
        return repository.findByCustomerName(name);
    }
    //get customer by email
    public Customer findByCustomerEmail(String email){
        return repository.findByCustomerEmail(email);
    }
    //get customer having age greater than?(user)
    List<Customer> findByCustomerAgeGreaterThan(int age){
        return repository.findByCustomerAgeGreaterThan(age);
    }

    //get customer having less than ? (user va)
    List<Customer> findByTotalPurchaseLessThan(double amt){
        return repository.findByTotalPurchaseLessThan(amt);
    }

}
