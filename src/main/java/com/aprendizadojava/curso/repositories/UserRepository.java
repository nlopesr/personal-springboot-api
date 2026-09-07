package com.aprendizadojava.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendizadojava.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
