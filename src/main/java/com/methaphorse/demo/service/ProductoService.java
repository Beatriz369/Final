package com.methaphorse.demo.service;
import java.util.List;

import com.methaphorse.demo.model.Producto;

public interface ProductoService {
	List<Producto> llamartodos();
	Producto llamaruno(Long Id);
	String guardar(Producto producto);
	String modificar(Producto producto);
	String eliminar(Long id);
}
