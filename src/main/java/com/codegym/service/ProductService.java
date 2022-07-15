package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    CategoryService categoryService=new CategoryService();
    public List<Product> products = new ArrayList<>();
public ProductService(){
    products.add(new Product(1, "Laptop Dell Inspiron15", 15000000, "https://cdn.nguyenkimmall.com/images/detailed/749/10049917-laptop-asus-zenbook-ux325ea-i5-1135g7-13-3-inch-kg363t.jpg", categoryService.categories.get(1), true));
    products.add(new Product(2, "Macbook pro", 40000000, "https://www.maccenter.vn/Adv_Images/Banner-MacBookPro-2022.jpg", categoryService.categories.get(0), true));
    products.add(new Product(3, "Tai nghe Dareu", 400000, "https://khadao.vn/uploads/plugin/product_items/497/1601003666-123261753-tai-nghe-dareu-eh469-rgb-pink.jpg", categoryService.categories.get(2), false));
    products.add(new Product(4, "Iphone 13 Promax", 27000000, "https://cdn.tgdd.vn/Products/Images/42/250262/s16/iphone-13-pro-max-thumbtz-650x650.png", categoryService.categories.get(1), true));
    products.add(new Product(5, "Asus zenbook", 32000000, "https://cdn.nguyenkimmall.com/images/detailed/749/10049917-laptop-asus-zenbook-ux325ea-i5-1135g7-13-3-inch-kg363t.jpg", categoryService.categories.get(0), false));
}
}
