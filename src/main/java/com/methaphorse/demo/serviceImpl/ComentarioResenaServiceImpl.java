package com.methaphorse.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.methaphorse.demo.model.ComentarioResena;
import com.methaphorse.demo.repository.ComentarioResenaRepository;
import com.methaphorse.demo.service.ComentarioResenaService;

@Service
public class ComentarioResenaServiceImpl implements ComentarioResenaService {

	@Autowired
	ComentarioResenaRepository comentariorep;

	public List<ComentarioResena> llamartodos() {
		return comentariorep.findAll();

	}

	public ComentarioResena llamaruno(Long Id) {
		return comentariorep.findByComentarioid(Id);

	}

	@Override
	public ComentarioResena guardar(ComentarioResena lb) {
		return  comentariorep.save(lb);
		
	}

	@Override
	public ComentarioResena modificar(ComentarioResena lb) {
		return 	comentariorep.save(lb);
		
	}

	@Override
	public String eliminar(Long id) {
	return	comentariorep.deleteByComentarioid(id);
		
	}
}
