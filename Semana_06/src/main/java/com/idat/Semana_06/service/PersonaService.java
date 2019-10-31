package com.idat.Semana_06.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.idat.Semana_06.dao.IPersonaDao;
import com.idat.Semana_06.model.Persona;

// Ctrl + 1 --> para implementar los metodos de la interfaz
@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private IPersonaDao personaDao;
	
	@Override
	public Persona registrar(Persona t) {
		System.out.println(t.toString());
		return personaDao.save(t);
	}

	@Override
	public Persona modificar(Persona t) {
		return personaDao.save(t);
	}

	@Override
	public boolean eliminar(Long id) {
		Persona _p = personaDao.findOne(id);
		if(_p != null) {
			personaDao.delete(id);
			return true;
		}
		return false;
	}

	@Override
	public Persona listarId(Long id) {
		return personaDao.findOne(id);
	}

	@Override
	public List<Persona> listar() {
		return personaDao.findAll();
	}

	@Override
	public Page<Persona> listarPageable(Pageable pageable) {
		return personaDao.findAll(pageable);
	}

}
