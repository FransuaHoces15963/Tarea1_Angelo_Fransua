package com.empresa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "deporte")
@Getter
@Setter
public class Deporte {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idDeporte;
	private String nombre;
}
