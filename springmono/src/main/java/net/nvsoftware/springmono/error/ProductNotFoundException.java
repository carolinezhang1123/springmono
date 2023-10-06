package net.nvsoftware.springmono.error;

import net.nvsoftware.springmono.model.Product;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String msg) {
        super(msg);
    }
}
