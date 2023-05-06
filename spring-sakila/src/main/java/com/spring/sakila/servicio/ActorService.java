package com.spring.sakila.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.sakila.entidades.Actor;
import com.spring.sakila.repositorio.ActorRepository;

@Service
public class ActorService {

	@Autowired
	private ActorRepository actorRepository;
	
	public List<Actor> getActores(){
		return actorRepository.findAll();
	}
}
