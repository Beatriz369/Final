package com.methaphorse.demo.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.methaphorse.demo.model.Producto;
import com.methaphorse.demo.model.TipoProducto;
import com.methaphorse.demo.repository.ProductoRepository;
import com.methaphorse.demo.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	ProductoRepository productorep;

	public List<Producto> llamartodos() {
		return productorep.findAll();

	}
	public Producto llamaruno(Long Id) {
		return (Producto) productorep.findByProductoid(Id);
	

	}

	@Override
	public String guardar(Producto rolb) {
		productorep.save(rolb);
		return "guardar";
	}

	@Override
	public String modificar(Producto rolb) {
		productorep.save(rolb);
		return "modificar";
	}

	@Override
	public String eliminar(Long id) {
		return	productorep.deleteByProductoid(id);
		
	}
}
