package com.shopping.service;

import java.math.BigDecimal;
import java.util.Map;

import com.shopping.exception.NotEnoughProductsInStockException;
import com.shopping.model.Product;

public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    void checkout() throws NotEnoughProductsInStockException;

    BigDecimal getTotal();
    
    void sendMail(String mail);
}
