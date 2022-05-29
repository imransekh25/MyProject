package com.NilBro.MyProject.Service;

import com.NilBro.MyProject.DTO.CategoryDTO;
import com.NilBro.MyProject.Model.Category;
import com.NilBro.MyProject.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class CategoryService {

    @Autowired
    CategoryRepo categoryRepo;

    public String createCategory(CategoryDTO categoryDTO){


        Category category= new Category();
        Optional<Category> id=  categoryRepo.findById((int) category.getId());

        if(id.isPresent()){
            return "Category Already Exist";
        }
        category.setId(categoryDTO.getCategoryId());
        category.setCategoryName(categoryDTO.getCategoryName());
        category.setCategoryDetails(categoryDTO.getCategoryDetails());
        category.setCategoryLogo(categoryDTO.getLogo());
        categoryRepo.save(category);

        return "success";
    }
}
