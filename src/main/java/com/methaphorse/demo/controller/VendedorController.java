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

import com.methaphorse.demo.model.Vendedor;
import com.methaphorse.demo.service.VendedorService;

@RestController // clase que te indica un controlador un contr va a devolver el resultado http
@RequestMapping("/vendedor")
public class VendedorController {

	@Autowired
	VendedorService vendedor;

	@GetMapping(value = "/obtenertodos", produces = { "application/json" }) // con esto tenemos en json
	public List<Vendedor> llamaroles() {
		return vendedor.llamartodos();

	}

	@GetMapping(value = "/obteneruno/{vendedorid}", produces = { "application/json" })
	public Object llamarol(@PathVariable("vendedorid") Long Id) {
		return vendedor.llamaruno(Id);
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardar(@RequestBody Vendedor lb) {
		vendedor.guardar(lb);
		return "guardar";
	}

	@RequestMapping(value = "/modificar", method = RequestMethod.PUT)
	public String modificar(@RequestBody Vendedor lb) {
		vendedor.modificar(lb);
		return "modificar";
	}

	@RequestMapping(value = "/eliminar/{vendedorid}", method = RequestMethod.DELETE )
	public String eliminar(@PathVariable("vendedorid") Long rolId) {
		vendedor.eliminar(rolId);
		return "eliminar";
	}

	@GetMapping(value = "/saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Hola Betty vendedor";
	}
}
