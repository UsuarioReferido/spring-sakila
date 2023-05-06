package com.spring.sakila.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Actor {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private short actorId;
	
	private String firtsName;
	private String lastName;
	private Date lastUpdate;
}
