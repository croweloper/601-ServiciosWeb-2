package com.idat.Semana_02.controller;


import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.idat.Semana_02.model.Producto;
import com.idat.Semana_02.model.Resultado;


@RestController
@RequestMapping("/productos")
public class ProductoController {
		
	
	@GetMapping(value = "/calcularmonto")
	public Resultado CalcularMonto(@RequestBody List<Producto> listprod) {
		Resultado result=new Resultado();
		result.setCantidad_total_productos(listprod.size());
		
		/*double sumatoria=0;
		
		for (Producto producto : listprod) {
			sumatoria+=((producto.getPrecio()*producto.getCantidad())-producto.getDescuento());
		}
		result.setMonto_total_pago(sumatoria);*/
		return result;
		
	}
}
