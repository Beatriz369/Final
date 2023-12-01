package com.methaphorse.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.methaphorse.demo.model.Transaccion;
import com.methaphorse.demo.repository.TransaccionRepository;
import com.methaphorse.demo.service.TransaccionService;

@Service
public class TransaccionServiceImpl implements TransaccionService {

	@Autowired
	TransaccionRepository transaccionrep;

	public List<Transaccion> llamartodos() {
		return transaccionrep.findAll();

	}

	public Transaccion llamaruno(Long Id) {
		return transaccionrep.findByTransaccionid(Id);

	}

	@Override
	public String guardar(Transaccion lb) {
		transaccionrep.save(lb);
		return "guardar";
	}

	@Override
	public String modificar(Transaccion lb) {
		transaccionrep.save(lb);
		return "modificar";
	}

	@Override
	public String  eliminar(Long id) {
		return transaccionrep.deleteByTransaccionid(id);
	}
}
