package com.aprendizadojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizadojava.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
