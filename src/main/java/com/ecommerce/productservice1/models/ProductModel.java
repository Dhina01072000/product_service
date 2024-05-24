package com.ecommerce.productservice1.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Data
public class ProductModel {
    private long id;
    private String title;
    private String description;
    private String image ;
    private String category ;
    private Double price;
}
