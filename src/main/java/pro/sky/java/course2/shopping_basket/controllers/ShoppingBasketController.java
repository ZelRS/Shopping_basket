package pro.sky.java.course2.shopping_basket.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.shopping_basket.model.Product;
import pro.sky.java.course2.shopping_basket.services.ShoppingBasketService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class ShoppingBasketController {
    private final ShoppingBasketService shoppingBasketService;

    public ShoppingBasketController(ShoppingBasketService shoppingBasketService) {
        this.shoppingBasketService = shoppingBasketService;
    }

    @GetMapping("/add")
    public String addProduct(@RequestParam("id") int productId) {
        shoppingBasketService.addProduct(productId);
        return "Товар №" + productId + " добавлен";
    }

    @GetMapping("/get")
    public List<Product> getProduct() {
        return shoppingBasketService.getProducts();
    }


}
