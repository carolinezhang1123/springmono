package net.nvsoftware.springmono.service;

import net.nvsoftware.springmono.error.ProductNotFoundException;
import net.nvsoftware.springmono.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {
    Product save(Product product);
    List<Product> getAll();
    Product getById(String id) throws ProductNotFoundException;
    String deleteById(String id);


}
