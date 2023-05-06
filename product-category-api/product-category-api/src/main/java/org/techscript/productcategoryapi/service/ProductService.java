package org.techscript.productcategoryapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techscript.productcategoryapi.model.Product;
import org.techscript.productcategoryapi.repository.ProductRepository;
import java.util.LinkedHashMap;
import java.util.Map;
@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    public Map<String, Object> getProductById(int id){
        Map<String,Object> data=new LinkedHashMap<>();
        Map<String,Object> details=new LinkedHashMap<>();
        Product p=repository.findById(id).orElse(null);
        int discountPercent=p.getCategoryRef().getDiscountPercent();
        int gstPercent=p.getCategoryRef().getGstPercent();
        int deliveryCharges=p.getCategoryRef().getDeliveryCharges();
        double basePrice=p.getProductPrice();
        double discountedPrice=basePrice*discountPercent/100;
        double updatedPrice=basePrice-discountedPrice;
        double gstPrice=updatedPrice*gstPercent/100;
        double finalCost=basePrice-discountedPrice+gstPrice+deliveryCharges;
        data.put("productId",p.getProductId());
        data.put("productName",p.getProductName());
        data.put("productType",p.getProductType());
        data.put("category",p.getCategoryRef().getCategoryName());
        data.put("base price",basePrice);
        data.put("discount", discountedPrice);
        details.put("gst",gstPrice);
        details.put("delivery",deliveryCharges);
        data.put("Charges",details);
        data.put("finalPrice",finalCost);
        return data;
    }
}
