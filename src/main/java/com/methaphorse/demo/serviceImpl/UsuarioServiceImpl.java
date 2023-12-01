package com.methaphorse.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.methaphorse.demo.model.Usuario;
import com.methaphorse.demo.repository.UsuarioRepository;
import com.methaphorse.demo.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository usuario;

	public List<Usuario> llamartodos() {
		return usuario.findAll();

	}

	public Usuario llamaruno(Long Id) {
		return usuario.findByUserid(Id);

	}

	@Override
	public String guardar(Usuario lb) {
		usuario.save(lb);
		return "guardar";
	}

	@Override
	public String modificar(Usuario lb) {
		usuario.save(lb);
		return "modificar";
	}

	@Override
	public String eliminar(Long id) {
		return usuario.deleteByUserid(id);
	}
}
