package com.aprendizadojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizadojava.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
