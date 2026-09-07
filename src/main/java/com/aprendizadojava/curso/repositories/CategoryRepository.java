package com.aprendizadojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizadojava.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
