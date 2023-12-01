package com.methaphorse.demo.serviceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.methaphorse.demo.model.CarritoCompras;
import com.methaphorse.demo.repository.CarritoComprasRepository;
import com.methaphorse.demo.service.CarritoComprasService;

@Service
public class CarritoComprasServiceImpl implements CarritoComprasService {

	@Autowired
	CarritoComprasRepository carritocompra;

	public List<CarritoCompras> llamartodos() {
		return carritocompra.findAll();

	}

	public CarritoCompras llamaruno(Long Id) {
		return carritocompra.findByCarritoid(Id);

	}

	@Override
	public String guardar(CarritoCompras lb) {
		carritocompra.save(lb);
		return "guardar";
	}

	@Override
	public String modificar(CarritoCompras lb) {
		carritocompra.save(lb);
		return "modificar";
	}

	@Override
	public String eliminar(Long id) {
	return	carritocompra.deleteByCarritoid(id);
	}
}
