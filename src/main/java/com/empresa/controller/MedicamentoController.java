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

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

@RestController
@RequestMapping("/rest/medicamento")
public class MedicamentoController {
	
	@Autowired
	private MedicamentoService service;
	/*
	 * metodos que retornan datos=GET
	 * metodos que dan registros a las tablas(insertar)=POST
	 * 
	 * */
	@GetMapping
	@ResponseBody//retorna daros en formato Jason
	public ResponseEntity<List<Medicamento>> listarMedicamento(){
		List<Medicamento> lista= service.listaMedicamento();
		return ResponseEntity.ok(lista);
	}
	@PostMapping
	@ResponseBody
	public ResponseEntity<Medicamento> insertaMedicamento(@RequestBody Medicamento obj){//van a entrar datos en formato jason
		Medicamento objSalida = service.InsertaActualizaMedicamento(obj);
		return ResponseEntity.ok(objSalida);
	} 
	
}
