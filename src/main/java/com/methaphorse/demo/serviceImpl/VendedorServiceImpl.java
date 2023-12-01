package com.methaphorse.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.methaphorse.demo.model.Vendedor;
import com.methaphorse.demo.repository.VendedorRepository;
import com.methaphorse.demo.service.VendedorService;

@Service
public class VendedorServiceImpl implements VendedorService {

	@Autowired
	VendedorRepository vendedorrep;

	public List<Vendedor> llamartodos() {
		return vendedorrep.findAll();

	}

	public Vendedor llamaruno(Long Id) {
		return vendedorrep.findByVendedorid(Id);

	}

	@Override
	public String guardar(Vendedor lb) {
		vendedorrep.save(lb);
		return "guardar";
	}

	@Override
	public String modificar(Vendedor lb) {
		vendedorrep.save(lb);
		return "modificar";
	}

	@Override
	public String eliminar(Long id) {
		return vendedorrep.deleteByVendedorid(id);
	}

	
}
