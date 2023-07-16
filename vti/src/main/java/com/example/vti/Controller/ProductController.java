package com.example.vti.Controller;

import com.example.vti.Entity.Product;
import com.example.vti.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")

public class ProductController {
    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> findAll(){
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product findOne(@PathVariable Long id){
        return productService.getProductById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.saveProduct(product);

    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id,@RequestBody Product product){
        Product existingProduct = productService.getProductById(id);
        if(existingProduct == null){
            return null ;
        }
        existingProduct.setPrice(product.getPrice());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setAlias(product.getAlias());
        existingProduct.setTitle(product.getTitle());

        return productService.updateProduct(existingProduct);
    }


}
