package org.jspider.springdatajpa.repository;

import org.jspider.springdatajpa.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    //returns the list of all customers
    List<Customer> findByCustomerName(String name);

    //return the customer details based on specific email id
    Customer findByCustomerEmail(String email);
    //returns the list of customer having age greater than specific
    List<Customer> findByCustomerAgeGreaterThan(int age);
    //return the list of customer having purchase amt less than 
    List<Customer> findByTotalPurchaseLessThan(double amt);
    //returns the list of customer having name =? and age =?
    //returns the list of customer having age between? and ?

}
