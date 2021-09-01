package com.empresa.service;

import java.util.List;

import org.hibernate.annotations.FetchProfile.FetchOverride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Deporte;
import com.empresa.repository.DeporteRepository;

@Service
public class DeporteServiceImpl implements DeporteService{
	
	@Autowired
	public DeporteRepository repository;
	
	@Override
	public List<Deporte> listarDeporte() {
		
		return repository.findAll();
	}

}
