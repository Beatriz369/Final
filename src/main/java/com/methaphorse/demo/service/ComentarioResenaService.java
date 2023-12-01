package com.methaphorse.demo.service;
import java.util.List;
import com.methaphorse.demo.model.ComentarioResena;

public interface ComentarioResenaService {

	List<ComentarioResena> llamartodos();
	ComentarioResena llamaruno(Long Id);
	ComentarioResena guardar(ComentarioResena comentario);
	ComentarioResena modificar(ComentarioResena comentario);
	String eliminar(Long id);
	
}
