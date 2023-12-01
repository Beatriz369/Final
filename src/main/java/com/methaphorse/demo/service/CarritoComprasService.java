package com.methaphorse.demo.service;
import java.util.List;
import com.methaphorse.demo.model.CarritoCompras;

public interface CarritoComprasService {

	List<CarritoCompras> llamartodos();
	CarritoCompras llamaruno(Long Id);
	String guardar(CarritoCompras carrito);
	String modificar(CarritoCompras carrito);
	String eliminar(Long id);
}
