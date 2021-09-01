package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Alumno;
import com.empresa.service.AlumnoService;

@RestController
@RequestMapping("/rest/alumno")
public class AlumnoController {

	@Autowired
	private AlumnoService service;

	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Alumno>> listarAlumno() {
		List<Alumno> lista = service.listaAlumno();
		return ResponseEntity.ok(lista);

	}

	@PostMapping
	@ResponseBody
	public ResponseEntity<Alumno> insertaAlumno(@RequestBody Alumno obj) {
		Alumno objSalida = service.insertaActualizaAlumno(obj);
		return ResponseEntity.ok(objSalida);

	}

}
