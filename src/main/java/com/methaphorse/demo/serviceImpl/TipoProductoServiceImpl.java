package com.methaphorse.demo.serviceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.methaphorse.demo.model.TipoProducto;
import com.methaphorse.demo.repository.TipoProductoRepository;
import com.methaphorse.demo.service.TipoProductoService;

@Service
public class TipoProductoServiceImpl implements TipoProductoService {

	@Autowired
	TipoProductoRepository tipoproductorep;

	public List<TipoProducto> llamartodos() {
		return tipoproductorep.findAll();

	}

	public TipoProducto llamaruno(Long Id) {
		return tipoproductorep.findByTipoproductoid(Id);

	}

	@Override
	public String guardar(TipoProducto lb) {
		tipoproductorep.save(lb);
		return "guardar";
	}

	@Override
	public String modificar(TipoProducto lb) {
		tipoproductorep.save(lb);
		return "modificar";
	}

	@Override
	public String eliminar(Long id) {
		return	tipoproductorep.deleteByTipoproductoid(id);
	}
}
