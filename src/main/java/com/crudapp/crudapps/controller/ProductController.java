package com.crudapp.crudapps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crudapp.crudapps.Repository.productsRepository;
import com.crudapp.crudapps.model.Products;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private productsRepository repo;

    @GetMapping({"","/"})
    public String showProductList(Model model){
        List<Products> products = repo.findAll();
        model.addAttribute("products",products);
        return "products/index";
    }
}
