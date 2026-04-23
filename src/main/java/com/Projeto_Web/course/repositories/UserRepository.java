package com.Projeto_Web.course.repositories;

import com.Projeto_Web.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
