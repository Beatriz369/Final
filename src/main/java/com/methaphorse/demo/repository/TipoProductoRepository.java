package com.methaphorse.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.methaphorse.demo.model.TipoProducto;
import com.methaphorse.demo.model.Vendedor;



	@Repository
	public interface TipoProductoRepository extends JpaRepository<TipoProducto, Long> {
		TipoProducto findByTipoproductoid(@Param("tipoproductoid") Long tipoproductoid);
			List<TipoProducto> findAll();
			String deleteByTipoproductoid(@Param("tipoproductoid") Long tipoproductoid);
}
	