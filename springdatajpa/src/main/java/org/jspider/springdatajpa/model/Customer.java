package org.jspider.springdatajpa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "customer_sales")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
   private int customerId;
    @Column(name = "name")
    private String customerName;
    @Column(name = "email")
    private String customerEmail;
    @Column(name = "age")
    private int customerAge;
    @Column(name = "total_purchase")
    private double totalPurchase;
}
