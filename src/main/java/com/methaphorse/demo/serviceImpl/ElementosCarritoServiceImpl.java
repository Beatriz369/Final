package com.methaphorse.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.methaphorse.demo.model.ElementosCarrito;
import com.methaphorse.demo.repository.ElementosCarritoRepository;
import com.methaphorse.demo.service.ElementosCarritoService;

@Service
public class ElementosCarritoServiceImpl implements ElementosCarritoService {

	@Autowired
	ElementosCarritoRepository elementoscarr;

	public List<ElementosCarrito> llamartodos() {
		return elementoscarr.findAll();

	}

	public ElementosCarrito llamaruno(Long Id) {
		return elementoscarr.findByElementoid(Id);

	}
	
	@Override
	public String guardar(ElementosCarrito lb) {
		elementoscarr.save(lb);
		return "guardar";
	}

	@Override
	public String modificar(ElementosCarrito lb) {
		elementoscarr.save(lb);
		return "modificar";
	}

	@Override
	public String eliminar(Long id) {
		return elementoscarr.deleteByElementoid(id);
	}
}
