package pro.sky.java.course2.shopping_basket.services;

import pro.sky.java.course2.shopping_basket.model.Product;

import java.util.List;

public interface ShoppingBasketService {
    void addProduct(int productId);

    List<Product> getProducts();
}
