package com.idat.Semana_02.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.idat.Semana_02.model.Persona;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/personas")
@Api(value="Servicio REST de Personas .....")
public class PersonaController {

	@GetMapping
	@ApiOperation("Listado de personas,retorna una lista de personas")
	public List<Persona> listar() {
		List<Persona> lista = new ArrayList<>();

		lista.add(new Persona(1, "Ronald", "Donayre"));
		lista.add(new Persona(1, "Raul", "Fernandez"));
		lista.add(new Persona(1, "Esteban", "Perez"));

		return lista;
	}

	
	@GetMapping(value = "/listar3")
	public ResponseEntity<List<Persona>> listar3() {

		List<Persona> lista = new ArrayList<>();

		lista.add(new Persona(1, "Ronald", "Donayre"));
		lista.add(new Persona(1, "Raul", "Fernandez"));
		lista.add(new Persona(1, "Esteban", "Perez"));

		return new ResponseEntity<>(lista, HttpStatus.ACCEPTED);

	}

	@GetMapping(value = "/listarError")
	public ResponseEntity<List<Persona>> listar2() { // Permite retornar un error con un codigo error definido.
		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona(1, "Ronald", "Donayre"));
		lista.add(new Persona(1, "Raul", "Fernandez"));
		lista.add(new Persona(1, "Esteban", "Perez"));
		return new ResponseEntity<List<Persona>>(HttpStatus.NOT_FOUND);
		// return new ResponseEntity<List<Persona>>(lista,HttpStatus.OK);
	}

	@PostMapping(value = "Crear/{apellido}")
	@ApiOperation("Guarda una de persona,retorna una mensaje")
	public String save(@RequestParam String Nombre, @PathVariable("apellido") String apellido) {
		return "Registro Creado: " + Nombre + " " + apellido;
	}

	@PutMapping(value = "/{id}")
	@ApiOperation("Actualiza el registro de persona,retorna el registro de una persona")
	public Persona update(@PathVariable("id") int id, @Valid @RequestBody Persona data) {
		data.setIdPersona(id);
		if (id == 1 || id == 2) {
			System.out.println(data.getApellido());
			System.out.println(data.toString() + " actualizado");
		} else {
			System.out.println(data.toString() + " creado");
		}
		return data;
	}

	@DeleteMapping(value = "{id}")
	@ApiOperation("Elimina una persona")
	public void remove(@PathVariable("id") int id) throws Exception {
		if (id == 1 || id == 2) {
			System.out.println("data removed");
		} else {
			throw new Exception("Error Id no Existe");
		}
	}

}