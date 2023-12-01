package com.methaphorse.demo.service;
import java.util.List;

import com.methaphorse.demo.controller.ResourceNotFoundException;
import com.methaphorse.demo.model.Rol;

public interface RolService {

	List<Rol> llamaroles() throws ResourceNotFoundException;
	Rol llamarol(Long rolId) throws ResourceNotFoundException;
	Rol guardar(Rol rol);
	Rol modificar(Rol rol);
	String eliminar(Long id);
}
//Agregar aqui rollservice y l aimplementacion para el junit coverage