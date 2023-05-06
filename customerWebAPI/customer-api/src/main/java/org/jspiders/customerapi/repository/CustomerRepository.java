package org.jspiders.customerapi.repository;

import org.jspiders.customerapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByCustomerName(String name);

    Customer findByCustomerEmail(String email);

    List<Customer> findByCustomerAgeGreaterThan(int age);

    List<Customer> findByTotalPurchaseLessThan(double amt);

    @Query("select c from Customer c where c.customerName=:name")
    List<Customer> viewCustomers( @Param("name") String name);

    @Query("select c.customerName from Customer c where c.customerAge<:age and c.totalPurchase>=:amt")
    List<String>  viewCustomerByCriteria(@Param("age") int age, @Param("amt") double amt);

//    @Query("select c.customerName from Customer c where c.customerName like %:first% or like %:second%")
//    List<String > getCustomerContains( @Param("first") char first, @Param("second") char second);
    @Query("select c.customerName from Customer c where c.customerName like %:first%")
    List<String> getCustomerByChar( @Param("first") String first);

//    //write jpql to customer name whose start with specific % or like %:second%")
    @Query("select c.customerName from Customer c where c.customerName like :first% ")
    List<String > getBySpecificChar(@Param("first") String first);

    //write jpql to customer name whose Ends with specific char
    @Query("select c.customerName from Customer c where c.customerName like %:end ")
    List<String > getBySpecificCharEnd(@Param("end") String end);

}
