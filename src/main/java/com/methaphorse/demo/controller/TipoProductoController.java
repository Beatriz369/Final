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

import com.methaphorse.demo.model.TipoProducto;
import com.methaphorse.demo.service.TipoProductoService;

@RestController // clase que te indica un controlador un contr va a devolver el resultado http
@RequestMapping("/tipoproducto")
public class TipoProductoController {

	@Autowired
	TipoProductoService tipoproductoser;

	@GetMapping(value = "/obtenertodos", produces = { "application/json" }) // con esto tenemos en json
	public List<TipoProducto> llamartodos() {
		return tipoproductoser.llamartodos();

	}

	@GetMapping(value = "/obteneruno/{tipoproductoid}", produces = { "application/json" })
	public Object llamarol(@PathVariable("tipoproductoid") Long tipoproductoId) {
		return tipoproductoser.llamaruno(tipoproductoId);
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardar(@RequestBody TipoProducto rolb) {
		tipoproductoser.guardar(rolb);
		return "guardar";
	}

	@RequestMapping(value = "/modificar", method = RequestMethod.PUT)
	public String modificar(@RequestBody TipoProducto lb) {
		tipoproductoser.modificar(lb);
		return "modificar";
	}

	@RequestMapping(value = "/eliminar/{tipoproductoid}", method = RequestMethod.DELETE )
	public String eliminar(@PathVariable("tipoproductoId") Long Id) {
		tipoproductoser.eliminar(Id);
		return "eliminar";
	}

	@GetMapping(value = "/saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Hola Betty desde Tipo Producto";
	}
}
