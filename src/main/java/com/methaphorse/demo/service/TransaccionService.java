package com.methaphorse.demo.service;
import java.util.List;

import com.methaphorse.demo.model.Transaccion;

public interface TransaccionService {
	List<Transaccion> llamartodos();
	Transaccion llamaruno(Long id);
	String guardar(Transaccion transaccion);
	String modificar(Transaccion transaccion);
	String eliminar(Long id);
}
