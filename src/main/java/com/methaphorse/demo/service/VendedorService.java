package com.methaphorse.demo.service;
import java.util.List;

import com.methaphorse.demo.model.Vendedor;

public interface VendedorService {
	List<Vendedor> llamartodos();
	Vendedor llamaruno(Long Id);
	String guardar(Vendedor vendedor);
	String modificar(Vendedor vendedor);
	//String eliminar(long l);
	String eliminar(Long id);
}
