package com.example.service;

import com.example.listing.model.Category;
import com.example.listing.repasitory.CategoryRepasitory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService {
    @Autowired
    private CategoryRepasitory categoryRepasitory;

    public List<Category> findALL() {
        return categoryRepasitory.findAll();
    }

    public Optional<Category> findById(int id){
        return categoryRepasitory.findById(id);
    }

}
