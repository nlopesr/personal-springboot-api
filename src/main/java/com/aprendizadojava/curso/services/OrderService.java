package com.aprendizadojava.curso.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.aprendizadojava.curso.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.aprendizadojava.curso.entities.Order;
import com.aprendizadojava.curso.repositories.OrderRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
