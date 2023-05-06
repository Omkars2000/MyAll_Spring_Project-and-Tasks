package org.jspiders.customerapi.service;

import org.jspiders.customerapi.model.Customer;
import org.jspiders.customerapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public void addCustomer(Customer c){
        repository.save(c);
    }

    //get all customers
    public List<Customer> getAllCustomer(Customer c){
        List<Customer> customerList=repository.findAll();
        return customerList;
    }
   // get customer by id
    public Customer getCustomerById(int id){
        return repository.findById(id).orElse(null);
    }
   // get customer by name
    public List<Customer> getCustomerByName(String name){
        return repository.findByCustomerName(name);
    }
  //  get customer by email
    public Customer getCustomerByemail(String email){
        return repository.findByCustomerEmail(email);
    }
   // get customer having age greater than ?(user)
    public List<Customer> getCustomerByAge(int age){
        return repository.findByCustomerAgeGreaterThan(age);
    }
   // get customer having purchase less than ?(user)
    public List<Customer> getCustomerTotalPurchase(double amt){
        return repository.findByTotalPurchaseLessThan(amt);
    }

    //returns the list of customer having name=? and age=?
    //returns the list of customer having between ? and ?

    public List<Customer> viewCustomer(String name){
        return repository.viewCustomers(name);
    }

    public List<String > getCondition(int age,double amt){
        return repository.viewCustomerByCriteria(age,amt);
    }
    public List<String> getCustomerBySpecific(String firstChar){
        return repository.getBySpecificChar(firstChar);
    }

    public List<String > getNameContains(String anyChar){
        return repository.getCustomerByChar(anyChar);
    }

    public List<String> getSpecificNameEnd(String end){
        return repository.getBySpecificCharEnd(end);
    }
}
