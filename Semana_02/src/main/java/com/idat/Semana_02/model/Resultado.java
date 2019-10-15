package com.idat.Semana_02.model;

public class Resultado {
	
	private int cantidad_total_productos;
	private double monto_total_pago;
	public Resultado(int cantidad_total_productos, double monto_total_pago) {
		super();
		this.cantidad_total_productos = cantidad_total_productos;
		this.monto_total_pago = monto_total_pago;
	}
	public int getCantidad_total_productos() {
		return cantidad_total_productos;
	}
	public void setCantidad_total_productos(int cantidad_total_productos) {
		this.cantidad_total_productos = cantidad_total_productos;
	}
	public double getMonto_total_pago() {
		return monto_total_pago;
	}
	public void setMonto_total_pago(double monto_total_pago) {
		this.monto_total_pago = monto_total_pago;
	}
	public Resultado() {
		
	}
	
	
	

}
