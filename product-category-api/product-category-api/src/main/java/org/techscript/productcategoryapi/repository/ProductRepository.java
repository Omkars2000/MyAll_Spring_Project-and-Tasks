package org.techscript.productcategoryapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.techscript.productcategoryapi.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}
