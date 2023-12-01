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

import com.methaphorse.demo.model.Usuario;
import com.methaphorse.demo.service.UsuarioService;

@RestController // clase que te indica un controlador un contr va a devolver el resultado http
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	UsuarioService usuario;

	@GetMapping(value = "/obtenertodos", produces = { "application/json" }) // con esto tenemos en json
	public List<Usuario> llamartodos() {
		return usuario.llamartodos();

	}

	@GetMapping(value = "/obteneruno/{userId}", produces = { "application/json" })
	public Object llamaruo(@PathVariable("userId") Long userId) {
		return usuario.llamaruno(userId);
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardar(@RequestBody Usuario lb) {
		usuario.guardar(lb);
		return "guardar";
	}

	@RequestMapping(value = "/modificar", method = RequestMethod.PUT)
	public String modificar(@RequestBody Usuario lb) {
		usuario.modificar(lb);
		return "modificar";
	}

	@RequestMapping(value = "/eliminar/{userId}", method = RequestMethod.DELETE )
	public String eliminar(@PathVariable("userId") Long Id) {
		usuario.eliminar(Id);
		return "eliminar";
	}

	@GetMapping(value = "/saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Hola Betty desde usuarios";
	}
}
