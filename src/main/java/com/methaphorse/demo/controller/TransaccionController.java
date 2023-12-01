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

import com.methaphorse.demo.model.Transaccion;
import com.methaphorse.demo.service.TransaccionService;

@RestController // clase que te indica un controlador un contr va a devolver el resultado http
@RequestMapping("/transaccion")
public class TransaccionController {

	@Autowired
	TransaccionService transaccion;

	@GetMapping(value = "/obtenertodos", produces = { "application/json" }) // con esto tenemos en json
	public List<Transaccion> llamartodos() {
		return transaccion.llamartodos();

	}

	@GetMapping(value = "/obteneruno/{transaccionId}", produces = { "application/json" })
	public Object llamarol(@PathVariable("transaccionId") Long transaccionId) {
		return transaccion.llamaruno(transaccionId);
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardar(@RequestBody Transaccion rolb) {
		transaccion.guardar(rolb);
		return "guardar";
	}

	@RequestMapping(value = "/modificar", method = RequestMethod.PUT)
	public String modificar(@RequestBody Transaccion rolb) {
		transaccion.modificar(rolb);
		return "modificar";
	}

	@RequestMapping(value = "/eliminar/{transaccionId}", method = RequestMethod.DELETE )
	public String eliminar(@PathVariable("transaccionId") Long transaccionId) {
		transaccion.eliminar(transaccionId);
		return "eliminar";
	}

	@GetMapping(value = "/saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Hola Betty dessde Transaccion";
	}
}
