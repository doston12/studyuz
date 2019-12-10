package com.teacher.uz.my.services;

import com.teacher.uz.my.domains.Category;
import com.teacher.uz.my.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
    public Category getCategory(int id){
        return categoryRepository.findOne(Long.valueOf(id));
    }
    public void saveCategory(Category category){
        categoryRepository.save(category);
    }
    public void delelteCategory(int id){
        categoryRepository.delete(Long.valueOf(id));
    }
}
