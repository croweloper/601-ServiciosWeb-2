package com.idat.Semana_06.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.Semana_06.model.Persona;

public interface IPersonaDao extends JpaRepository<Persona, Long> {

}
