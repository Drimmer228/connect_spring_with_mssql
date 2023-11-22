package com.example.jpavalidator.controllers;

import com.example.jpavalidator.models.PersonModel;
import com.example.jpavalidator.models.ProductModel;
import com.example.jpavalidator.repositories.PersonRepository;
import com.example.jpavalidator.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController extends CrudController<ProductModel, Long> {
    private final ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        super(productRepository, "product");
        this.productRepository = productRepository;
    }

    @GetMapping("/search")
    public String searchByName(@RequestParam("name") String name, Model model) {
        List<ProductModel> productByName = productRepository.findByName(name);
        model.addAttribute("products", productByName);
        return "products/search_results";
    }
}
