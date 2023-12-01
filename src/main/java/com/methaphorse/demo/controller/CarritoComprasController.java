package com.methaphorse.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.methaphorse.demo.model.CarritoCompras;
import com.methaphorse.demo.service.CarritoComprasService;

@RestController // clase que te indica un controlador un contr va a devolver el resultado http
@RequestMapping("/carritocompras")
public class CarritoComprasController {

	@Autowired
	CarritoComprasService carrito;

	@GetMapping(value = "/obtenertodos", produces = { "application/json" }) // con esto tenemos en json
	public List<CarritoCompras> llamartodos() {
		return carrito.llamartodos();

	}

	@GetMapping(value = "/obteneruno/{carritoId}", produces = { "application/json" })
	public Object llamaruno(@PathVariable("carritoId") Long Id) {
		return carrito.llamaruno(Id);
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardar(@RequestBody CarritoCompras lb) {
		carrito.guardar(lb);
		return "guardar";
	}

	@RequestMapping(value = "/modificar", method = RequestMethod.PUT)
	public String modificar(@RequestBody CarritoCompras lb) {
		carrito.modificar(lb);
		return "modificar";
	}

	@RequestMapping(value = "/eliminar/{carritoId}", method = RequestMethod.DELETE )
	public String eliminar(@PathVariable("carritoId") Long Id) {
		carrito.eliminar(Id);
		return "eliminar";
	}

	@GetMapping(value = "/saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Hola Betty desde carrito de Compras";
	}
}
