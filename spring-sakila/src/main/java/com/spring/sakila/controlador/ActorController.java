package com.spring.sakila.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.sakila.entidades.Actor;
import com.spring.sakila.servicio.ActorService;

@RestController
@RequestMapping("/actor")
public class ActorController {
	
	@Autowired
	private ActorService actorService;
	
	@GetMapping
	public List<Actor> getActores(){
		return actorService.getActores();
	}
	
}
