package com.idat.Semana_02.model;

public class Producto {
	
	private int codigo;
	private String nombre;
	private double precio;
	private	int cantidad;
	private double descuento;
	
	
	public Producto(int codigo, String nombre, double precio, int cantidad, double descuento) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	
	public Producto() {
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	
	
	

}
