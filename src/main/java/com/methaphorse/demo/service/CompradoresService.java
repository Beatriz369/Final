package com.methaphorse.demo.service;
import java.util.List;

import com.methaphorse.demo.model.Compradores;

public interface  CompradoresService {
	List<Compradores> llamartodos();
	Compradores llamaruno(Long Id);
	Compradores guardar(Compradores compradores);
	Compradores modificar(Compradores compradores);
	String eliminar(Long id);
}
