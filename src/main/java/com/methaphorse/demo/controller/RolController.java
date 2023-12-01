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

import com.methaphorse.demo.model.Rol;
import com.methaphorse.demo.service.RolService;

@RestController // clase que te indica un controlador un contr va a devolver el resultado http
@RequestMapping("/roles")
public class RolController {

	@Autowired
	RolService rol;

	@GetMapping(value = "/obtenertodos", produces = { "application/json" }) // con esto tenemos en json
	public List<Rol> llamaroles() throws ResourceNotFoundException {
		List<Rol> Rol = rol.llamaroles();
	//	try {
		System.out.println("rollllll  "+Rol.size());
	
		 return Rol;
//		}catch (Exception e) {
//			throw new ResourceNotFoundException("No hay Roles 2");
//		}
	

	}

	@GetMapping(value = "/obteneruno/{rolId}", produces = { "application/json" })
	public Rol llamarol(@PathVariable("rolId") Long rolId) throws ResourceNotFoundException{
		
		List<Rol> Rol = rol.llamaroles();
		//	try {
			System.out.println("rollllll  "+Rol.size());
			/*
			 * if(Rol == null || Rol.size()==0) { throw new
			 * ResourceNotFoundException("No hay Rol"); }
			 */
		return rol.llamarol(rolId);
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardar(@RequestBody Rol rolb) {
		rol.guardar(rolb);
		return "guardar";
	}

	@RequestMapping(value = "/modificar", method = RequestMethod.PUT)
	public Rol modificar(@RequestBody Rol rolb) {
		rol.modificar(rolb);
		return rolb;
	}

	@RequestMapping(value = "/eliminar/{rolId}", method = RequestMethod.DELETE )
	public String eliminar(@PathVariable("rolId") Long rolId) {
		rol.eliminar(rolId);
		return "eliminar";
	}

	@GetMapping(value = "/saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludo() {
		return "Hola Betty";
	}
}
