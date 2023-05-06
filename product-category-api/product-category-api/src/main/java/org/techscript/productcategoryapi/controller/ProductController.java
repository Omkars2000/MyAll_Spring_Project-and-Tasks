package org.techscript.productcategoryapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.techscript.productcategoryapi.service.ProductService;

import java.util.Map;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/product/{id}")
    public Map<String, Object> getProductById(@PathVariable int id){
        return service.getProductById(id);
    }
}
