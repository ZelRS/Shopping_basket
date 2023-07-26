package pro.sky.java.course2.shopping_basket.services;

import pro.sky.java.course2.shopping_basket.model.Product;

import java.util.List;

public interface ShoppingBasketService {
    void addProduct(List<Integer> ids);

    List<Product> getProducts();
}
