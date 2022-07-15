package com.codegym.controller;

import com.codegym.model.Category;
import com.codegym.model.Product;
import com.codegym.service.CategoryService;
import com.codegym.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Dashboard {

    ProductService productService =new ProductService();
CategoryService categoryService = new CategoryService();
    @GetMapping("/dashboard")
    public ModelAndView show() {
       ModelAndView modelAndView = new ModelAndView("dashboard");
       modelAndView.addObject("products",productService.products);
        return modelAndView;
    }

    @GetMapping("/create")
    public String showCreate(){
        return "create";
    }

    @PostMapping("/create")
    public String create(Product product){
        productService.products.add(product);
        return "redirect:/dashboard";
    }
//    @PostMapping("/save")
//    public String save(Product customer) {
//        customer.setId((int) (Math.random() * 10000));
//        ProductDao.save(customer);
//        return "redirect:/dashboard";
//    }
}
