package com.aprendizadojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizadojava.curso.entities.Order;
import com.aprendizadojava.curso.entities.pk.OrderItemPK;
import com.aprendizadojava.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
