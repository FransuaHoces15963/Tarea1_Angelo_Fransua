package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer >{

	//Esta plantilla ayuda a crear todos los metodos ctrl+space para ver los metodos
	
}
