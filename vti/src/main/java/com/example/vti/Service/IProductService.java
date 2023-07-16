package com.example.vti.Service;

import com.example.vti.Entity.Product;

import java.util.List;

public interface IProductService {
    public List<Product> getAllProducts() ;
    public Product saveProduct(Product product);

    public Product updateProduct(Product product);

    public Product getProductById(Long id);
}
