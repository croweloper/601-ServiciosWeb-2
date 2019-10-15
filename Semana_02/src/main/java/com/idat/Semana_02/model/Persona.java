package com.idat.Semana_02.model;

import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Información del Objeto")
public class Persona {

	private int idPersona; //alt + shit + s
	private String Nombre;
	private String Apellido;
	
	@ApiModelProperty(position=1,notes="Id de la persona , tipod , longitud", name="Id Persona", example="1")
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	@ApiModelProperty(position=2,notes="Nombre de la persona , tipod , longitud", name="Nombre Persona", example="Juanito")
	@Size(min=10,max=20,message="Solo cantidad de caracteres entre 10 a 20.")
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	@ApiModelProperty(position=3,notes="Apellido de la persona , tipod , longitud", name="Apellido Persona", example="Alcachofa")
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	public Persona()
	{}
	
	public Persona(int idPersona, String nombre, String apellido) {
		super();
		this.idPersona = idPersona;
		Nombre = nombre;
		Apellido = apellido;
	}
	
	
	
}