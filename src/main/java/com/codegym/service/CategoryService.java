package com.codegym.service;

import com.codegym.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    public List<Category> categories = new ArrayList<>();

    public CategoryService() {
        categories.add(new Category(1, "Laptop"));
        categories.add(new Category(2, "Smartphone"));
        categories.add(new Category(3, "Accessories"));
    }
}
