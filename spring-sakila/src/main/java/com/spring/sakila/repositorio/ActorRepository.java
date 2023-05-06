package com.spring.sakila.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.sakila.entidades.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer>{

}
