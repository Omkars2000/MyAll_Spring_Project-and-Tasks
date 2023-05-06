package org.techscript.productcategoryapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "category_info")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "discount")
    private int discountPercent;
    @Column(name = "gst")
    private int gstPercent;
    @Column(name = "delivery_charge")
    private int deliveryCharges;
    @OneToMany(mappedBy = "categoryRef",cascade = CascadeType.ALL)
    private List<Product> productList;
}
