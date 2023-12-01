package com.methaphorse.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.methaphorse.demo.controller.ResourceNotFoundException;
import com.methaphorse.demo.model.Rol;
import com.methaphorse.demo.repository.RolRepository;
import com.methaphorse.demo.service.RolService;

@Service
public class RolServiceImpl implements RolService {

	@Autowired
	RolRepository rol;

	public List<Rol> llamaroles() throws ResourceNotFoundException {
		List<Rol> Rol =  rol.findAll();
		 if(Rol == null || Rol.size()==0) {
			 throw new ResourceNotFoundException("No hay Roles");
		 }
		
		return Rol;

	}

	public Rol llamarol(Long rolId) throws ResourceNotFoundException {
		//return rol.findByRolid(rolId);
		
		
		Rol Rol =  rol.findByRolid(rolId);
		 if(Rol == null || ((List<Rol>) Rol).size()==0) {
			 throw new ResourceNotFoundException("No hay Roles");
		 }
		
		return Rol;

	}

	@Override
	public Rol guardar(Rol rolb) {
		
		return	 rol.save(rolb);
		
		
	}
	
	

	@Override
	public Rol modificar(Rol rolb) {
		return rol.save(rolb);
		
	}

	@Override
	public String eliminar(Long id) {//try catch
		rol.deleteByRolid(id);
		return "Eliminado";
	}
}
