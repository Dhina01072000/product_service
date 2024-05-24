package com.ecommerce.productservice1.services;

import com.ecommerce.productservice1.dtos.GetProductDto;
import com.ecommerce.productservice1.exceptions.NotFoundException;
import com.ecommerce.productservice1.models.ProductModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    public GetProductDto getProductById (Long id)throws NotFoundException
    {
    RestTemplate restTemplate = new RestTemplate();
    String url = "http://fakestoreapi.com/products/" + id;
    ProductModel product = restTemplate.getForObject(url, ProductModel.class);
    System.out.println(product);
    if(product==null)
    {
        throw new NotFoundException();
    }
    return convertToDto(product);
    }
    public static GetProductDto convertToDto(ProductModel product){
        GetProductDto obj = new GetProductDto();
        obj.setId(product.getId());
        obj.setTitle(product.getTitle());
        obj.setPrice(product.getPrice());
        obj.setCategory(product.getCategory());
        return obj;
    }
    public List<GetProductDto> getProductlist()
    {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://fakestoreapi.com/products/" ;
        ProductModel[] products= restTemplate.getForObject(url, ProductModel[].class);

        List<GetProductDto> productlist = new ArrayList<>();
        for (ProductModel product :products){
            productlist.add(convertToDto(product));
        }
        return productlist;

    }
}
