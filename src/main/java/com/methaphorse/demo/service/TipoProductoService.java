package com.methaphorse.demo.service;
import java.util.List;

import com.methaphorse.demo.model.TipoProducto;

public interface TipoProductoService {
	List<TipoProducto> llamartodos();
	TipoProducto llamaruno(Long Id);
	String guardar(TipoProducto tipoproducto);
	String modificar(TipoProducto tipoproducto);
	String eliminar(Long id);
}
