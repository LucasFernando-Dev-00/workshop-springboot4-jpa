package com.Projeto_Web.course.srevices;


import com.Projeto_Web.course.entities.Category;
import com.Projeto_Web.course.entities.Order;
import com.Projeto_Web.course.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductService repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
