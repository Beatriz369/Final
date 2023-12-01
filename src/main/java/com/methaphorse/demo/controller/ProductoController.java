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

import com.methaphorse.demo.model.Producto;
import com.methaphorse.demo.service.ProductoService;

@RestController // clase que te indica un controlador un contr va a devolver el resultado http
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	ProductoService productoser;

	@GetMapping(value = "/obtenertodos", produces = { "application/json" }) // con esto tenemos en json
	public List<Producto> llamatodos() {
		return productoser.llamartodos();

	}

	@GetMapping(value = "/obteneruno/{productoId}", produces = { "application/json" })
	public Object llamaruno(@PathVariable("productoId") Long productoId) {
		return productoser.llamaruno(productoId);
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardar(@RequestBody Producto lb) {
		productoser.guardar(lb);
		return "guardar";
	}

	@RequestMapping(value = "/modificar", method = RequestMethod.PUT)
	public String modificar(@RequestBody Producto lb) {
		productoser.modificar(lb);
		return "modificar";
	}

	@RequestMapping(value = "/eliminar/{rolId}", method = RequestMethod.DELETE )
	public String eliminar(@PathVariable("productoid") Long productoid) {
		productoser.eliminar(productoid);
		return "eliminar";
	}

	@GetMapping(value = "/saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Hola Betty desde producto";
	}
}
