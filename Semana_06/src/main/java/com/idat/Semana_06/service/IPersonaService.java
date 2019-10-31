package com.idat.Semana_06.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.idat.Semana_06.model.Persona;

public interface IPersonaService {

	Persona registrar(Persona t);
	
	Persona modificar(Persona t);

	boolean eliminar(Long id);

	Persona listarId(Long id);

	List<Persona> listar();
	
	Page<Persona> listarPageable(Pageable pageable);
	
}
