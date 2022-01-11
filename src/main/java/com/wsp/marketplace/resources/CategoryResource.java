package com.wsp.marketplace.resources;

import com.wsp.marketplace.domain.Category;
import com.wsp.marketplace.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/category")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> list(@PathVariable Integer id){
        Category category = service.find(id);

        return ResponseEntity.ok().body(category);

    }

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody Category body){
        Category category = service.create(body);

        return ResponseEntity.ok().body(category);
    }
}
