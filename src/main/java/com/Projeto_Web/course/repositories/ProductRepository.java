package com.Projeto_Web.course.repositories;

import com.Projeto_Web.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
