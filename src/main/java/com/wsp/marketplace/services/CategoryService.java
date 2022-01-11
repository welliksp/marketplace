package com.wsp.marketplace.services;

import com.wsp.marketplace.domain.Category;
import com.wsp.marketplace.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public Category find(Integer id){
        Category category = repository.getById(id);
        return category;
    };

    public Category create(Category body){
        Category category = repository.save(body);
        return category;
    };

}