package com.Projeto_Web.course.repositories;

import com.Projeto_Web.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
