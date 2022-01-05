package com.wsp.cursomc.resources;

import com.wsp.cursomc.domain.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/category")
public class CategoryResource {

    @GetMapping()
    public List<Category> list(){
        Category cat1 = new Category();
        cat1.setId(1);
        cat1.setName("Informatica");



        Category cat2 = new Category();
        cat2.setId(2);
        cat2.setName("Escritorio");

        List<Category> list = Arrays.asList(cat1,cat2);



        return list;
    }
}
