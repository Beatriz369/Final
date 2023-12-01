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

import com.methaphorse.demo.model.Compradores;
import com.methaphorse.demo.service.CompradoresService;

@RestController // clase que te indica un controlador un contr va a devolver el resultado http
@RequestMapping("/compradores")
public class CompradoresController {

	@Autowired
	CompradoresService compradoress;

	@GetMapping(value = "/obtenertodos", produces = { "application/json" }) // con esto tenemos en json
	public List<Compradores> llamartodos() {
		return compradoress.llamartodos();

	}

	@GetMapping(value = "/obteneruno/{Id}", produces = { "application/json" })
	public Object llamauno(@PathVariable("Id") Long Id) {
		return compradoress.llamaruno(Id);
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardar(@RequestBody Compradores lb) {
		compradoress.guardar(lb);
		return "guardar";
	}

	@RequestMapping(value = "/modificar", method = RequestMethod.PUT)
	public String modificar(@RequestBody Compradores lb) {
		compradoress.modificar(lb);
		return "modificar";
	}

	@RequestMapping(value = "/eliminar/{Id}", method = RequestMethod.DELETE )
	public String eliminar(@PathVariable("Id") Long Id) {
		compradoress.eliminar(Id);
		return "eliminar";
	}

	@GetMapping(value = "/saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Hola Betty saludo desde compradores";
	}
}
