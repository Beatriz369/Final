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

import com.methaphorse.demo.model.ElementosCarrito;
import com.methaphorse.demo.service.ElementosCarritoService;

@RestController // clase que te indica un controlador un contr va a devolver el resultado http
@RequestMapping("/elementoscarrito")
public class ElementosCarritoController {

	@Autowired
	ElementosCarritoService elemento;

	@GetMapping(value = "/obtenertodos", produces = { "application/json" }) // con esto tenemos en json
	public List<ElementosCarrito> llamartodos() {
		return elemento.llamartodos();

	}

	@GetMapping(value = "/obteneruno/{elementoId}", produces = { "application/json" })
	public Object llamaruno(@PathVariable("elementoId") Long elementoId) {
		return elemento.llamaruno(elementoId);
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardar(@RequestBody ElementosCarrito lb) {
		elemento.guardar(lb);
		return "guardar";
	}

	@RequestMapping(value = "/modificar", method = RequestMethod.PUT)
	public String modificar(@RequestBody ElementosCarrito lb) {
		elemento.modificar(lb);
		return "modificar";
	}

	@RequestMapping(value = "/eliminar/{rolId}", method = RequestMethod.DELETE )
	public String eliminar(@PathVariable("elementoId") Long elementoId) {
		elemento.eliminar(elementoId);
		return "eliminar";
	}

	@GetMapping(value = "/saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Hola Betty desde elemntos Carrito";
	}
}
