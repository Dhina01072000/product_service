package com.ecommerce.productservice1.dtos;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class GetProductDto {
    private long id;
    private String title;
    private String category ;
    private Double price;
}
