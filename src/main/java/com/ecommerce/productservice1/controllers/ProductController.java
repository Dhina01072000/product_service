package com.ecommerce.productservice1.controllers;

import com.ecommerce.productservice1.dtos.GetProductDto;
import com.ecommerce.productservice1.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/products")
public class ProductController {
    private  ProductService ps;

public ProductController(ProductService ps) {
    this.ps = ps;
}
    @GetMapping("/{id}/{name}")
    public String getProductById(@PathVariable long id, @PathVariable String name) {
        return "the Product id is"+id+" "+name;
    }
    @GetMapping("/{id}")
    public @ResponseBody GetProductDto getProductById (@PathVariable long id) throws Exception{
        return ps.getProductById(id);
    }
    @GetMapping()
    public @ResponseBody List<GetProductDto> getProductlist() {
        return ps.getProductlist();
    }
}
