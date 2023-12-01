package com.methaphorse.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.methaphorse.demo.model.Compradores;
import com.methaphorse.demo.model.Rol;
import com.methaphorse.demo.repository.CompradoresRepository;
import com.methaphorse.demo.service.CompradoresService;

@Service
public class CompradoresServiceImpl implements CompradoresService {

	@Autowired
	CompradoresRepository compradorre;

	public List<Compradores> llamartodos() {
		return compradorre.findAll();

	}

	public Compradores llamaruno(Long Id) {
		return compradorre.findByCompradorid(Id);

	}

	@Override
	public Compradores guardar(Compradores lb) {
	return	compradorre.save(lb);
	
	}
	
	

	@Override
	public Compradores modificar(Compradores lb) {
		
		return compradorre.save(lb);
	}

	@Override
	public String eliminar(Long id) {
		return	compradorre.deleteByCompradorid(id);
	}
}
