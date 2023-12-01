package com.methaphorse.demo.service;
import java.util.List;

import com.methaphorse.demo.model.ElementosCarrito;

public interface ElementosCarritoService {
	List<ElementosCarrito> llamartodos();
	ElementosCarrito llamaruno(Long Id);
	String guardar(ElementosCarrito elementoscarrito);
	String modificar(ElementosCarrito elementoscarrito);
	String eliminar(Long id);
}
