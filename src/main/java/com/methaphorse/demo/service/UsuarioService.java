package com.methaphorse.demo.service;
import java.util.List;

import com.methaphorse.demo.model.Usuario;
import com.methaphorse.demo.model.Vendedor;

public interface UsuarioService {
	List<Usuario> llamartodos();
	Usuario llamaruno(Long Id);
	String guardar(Usuario usuario);
	String modificar(Usuario usuario);
	String eliminar(Long id);
	
}
