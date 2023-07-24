package pro.sky.java.course2.shopping_basket.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.java.course2.shopping_basket.model.Product;
import pro.sky.java.course2.shopping_basket.services.ShoppingBasketService;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class ShoppingBasketServiceImpl implements ShoppingBasketService {
    private final List<Product> products;

    public ShoppingBasketServiceImpl() {
        this.products = new ArrayList<>(List.of());
    }

    @Override
    public void addProduct(int productId) {
        products.add(new Product(productId));
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
}
