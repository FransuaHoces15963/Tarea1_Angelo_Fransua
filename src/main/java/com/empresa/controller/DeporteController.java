package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Deporte;
import com.empresa.service.DeporteService;

@RestController
@RequestMapping("/rest/deporte")
public class DeporteController {
	@Autowired
	private DeporteService service;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Deporte>> listarDeporte() {
		List<Deporte> lista = service.listarDeporte();
		return ResponseEntity.ok(lista);

	}
}
