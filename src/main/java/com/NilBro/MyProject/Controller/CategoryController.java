package com.NilBro.MyProject.Controller;

import com.NilBro.MyProject.DTO.CategoryDTO;
import com.NilBro.MyProject.Model.Category;
import com.NilBro.MyProject.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;


    @PostMapping("/create")
    public String createCategory (@RequestBody CategoryDTO categoryDTO){
        categoryService.createCategory(categoryDTO);
        return "success";
    }
}
